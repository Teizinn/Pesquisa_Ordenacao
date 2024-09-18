Avaliação semestral de Pesquisa e Ordenação 18/09/2024

Nome: Gabriel Teixeira

1) O que é ordenação e qual o seu papel nos sistemas de informação?
        
        -Ordenação organiza dados de forma sequencial, facilitando buscas e processamento de informações nos sistemas.

2) Na construção de algoritmos, por exemplo, algoritmos de ordenação, há o conceito de complexidade. Assim, em ordenação como se calcula ou se mede a complexidade?

        -A complexidade é medida em termos de tempo e espaço, usando a notação O, que avalia o número de operações necessárias, variando entre melhor, pior e caso médio.

3) Novamente, no contexto de algoritmos de ordenação, há algoritmos estáveis e instáveis. Explique o que isso significa.
        
        -Algoritmos estáveis mantêm a ordem relativa de elementos iguais. Algoritmos instáveis não garantem essa preservação.
        Nâo significa necessáriamente que um método é pior que o outro apenas por ser menos estável.

4) Dos algoritmos estudados(Bolha, seleção, inserção e pente), há um desses que tem um desempenho muito bom. Qual é? e qual o recurso computacional que ele utiliza para ser tão melhor que os outros? Explique a resposta.

           -O pente geralmente apresenta um desempenho melhor em comparação com os outros, especialmente para conjuntos de dados maiores. O método Pente é uma variação do Bolha que reduz a distância de comparação gradualmente, o que permite que os elementos sejam movidos mais rapidamente em direção à sua posição final. O recurso computacional que torna o Pente mais eficiente é a redução progressiva do gap, o que permite mover elementos distantes, minimizando as comparações desnecessárias e as trocas de elementos muito próximos, algo que ocorre em excesso no Bolha.

6) Observe a sequencia de números no vetor:
    0 1 2 3 4 5 6   - indices
    7 3 5 1 8 2 5   - valores
    a) Quantas comprações e trocas vão ocorrer usando o bolha?
        
        - 21 comparações e 11 trocas.

    b) Quantas comparações e trocas vão ocorrer usando o pente?
        
        - Aproximadamente 16 comparações e 8 trocas.

7) Dos métodos estudados (Bolha, seleção, inserção e pente), quais são estáveis e quais são instáveis?

        Estáveis: Bolha e inserção.
        Instáveis: Seleção e pente.

8) No processo de ordenação de listas contendo objetos, como pessoas que derivam de classe Pessoa(nome, email, telefone, curso), para usar o método sort, em Java ou em C Sharp é preciso realizar alterações na classe Pessoa para que a ordenação ocorra corretamente. Exemplifique e Explique qual ou quais são essa(s) alterações.
        
        -Para ordenar uma lista de objetos de uma classe como Pessoa em Java ou C#, é necessário implementar a interface Comparable ou fornecer um Comparator. O método principal que deve ser sobrescrito é o compareTo (em Java) ou a implementação de um comparador que define as regras de ordenação. Em C#, o método IComparable ou IComparer é usado.
