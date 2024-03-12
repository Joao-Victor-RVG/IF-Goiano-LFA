class DFA:
    def __init__(self, states, alphabet, transition_function, start_state, accept_states):
        self.states = states
        self.alphabet = alphabet
        self.transition_function = transition_function
        self.start_state = start_state
        self.accept_states = accept_states

    def is_valid(self, input_string):
        current_state = self.start_state
        for symbol in input_string:
            if symbol not in self.alphabet:
                return False, "A cadeia contém símbolos inválidos."
            current_state = self.transition_function.get((current_state, symbol))
            if current_state is None:
                return False, "A cadeia foi rejeitada."
        if current_state in self.accept_states:
            return True, "A cadeia foi aceita."
        else:
            return False, "A cadeia foi rejeitada."

    def is_minimized(self):
        for state1 in self.states:
            for state2 in self.states:
                if state1 != state2 and (state1 in self.accept_states) != (state2 in self.accept_states):
                    return False
        return True


def main():
    # Defina o DFA
    states = {'q0', 'q1', 'q2'}
    alphabet = {'0', '1'}
    transition_function = {
        ('q0', '0'): 'q1',
        ('q0', '1'): 'q0',
        ('q1', '0'): 'q2',
        ('q1', '1'): 'q0',
        ('q2', '0'): 'q2',
        ('q2', '1'): 'q0'
    }
    start_state = 'q0'
    accept_states = {'q2'}

    dfa = DFA(states, alphabet, transition_function, start_state, accept_states)

    # Teste de validade da cadeia
    input_string = input("Digite uma cadeia a ser testada: ")
    is_valid, message = dfa.is_valid(input_string)
    print(message)

    # Verificação se o DFA está minimizado
    if dfa.is_minimized():
        print("O autômato está minimizado.")
    else:
        print("O autômato não está minimizado.")


if __name__ == "__main__":
    main()
