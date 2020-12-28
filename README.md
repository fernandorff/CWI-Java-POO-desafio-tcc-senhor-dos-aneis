![A Sociedade do Anel](https://www.intofilm.org/intofilm-production/scaledcropped/1096x548https%3A/s3-eu-west-1.amazonaws.com/images.cdn.filmclub.org/film__3930-the-lord-of-the-rings-the-fellowship-of-the-ring--hi_res-a207bd11.jpg/film__3930-the-lord-of-the-rings-the-fellowship-of-the-ring--hi_res-a207bd11.jpg)

# Senhor dos Anéis

O Senhor dos Anéis é um livro de alta fantasia, escrito pelo escritor britânico J. R. R. Tolkien entre 1937 e 1949. A história narra o conflito contra o mal que se alastra 
pela Terra-média, através da luta de várias raças: Humanos, Anãos, Elfos, Orcs e Goblins, para evitar  que o Anel do Poder volte às mãos de seu criador Sauron, o Senhor Sombrio. 
Partindo dos primórdios tranquilos do Condado, a história muda através da Terra-média e segue o curso da Guerra do Anel através dos olhos de seus personagens.

## Parte 1

## Personagens

Todos os personagens possuem valores de Força, Agilidade, Inteligência e Constituição. A única que pode ser alterada é a constituição, esta não pode nunca ficar negativa
ou ser aumentada, apenas reduzida.

### Aragorn

![](https://media.giphy.com/media/SWjCswum5dc0E/giphy.gif)

**Guerreiro Humano**

Força: 10

Agilidade: 7

Inteligência: 6

Constituição inicial: 60

Fala: "A day may come when the courage of men fails… but it is not THIS day."

Ao `envelhecer` recebe 1 de dano.

Faz parte da sociedade do anel.

toString: A

### Gandalf

![](https://media.giphy.com/media/Qs75BqLW44RrP0x6qL/giphy.gif)

**Mago Maia**

Força: 2

Agilidade: 3

Inteligência: 10

Constituição inicial: 80

Fala: "A Wizard is never late, nor is he early. He arrives precisely when he means to."

Ao `ressucitar`, se estiver com a constituição igual a zero, retorna uma nova instância de Gandalf().

Faz parte da sociedade do anel.

toString: G

### Legolas

![](https://media.giphy.com/media/4mBzKXTeRmEOA/giphy.gif)

**Arqueiro Elfo**

Força: 5

Agilidade: 10

Inteligência: 6

Constituição inicial: 80

Fala: "They're taking the Hobbits to Isengard!"

Fala em élfico: "I amar prestar aen, han mathon ne nem, han mathon ne chae, a han noston ned."

Faz parte da sociedade do anel.

toString: L

### Gimli

![](https://media.giphy.com/media/43g7hyj8d8NEY/giphy.gif)

**Guerreiro Anão**

Força: 9

Agilidade: 2

Inteligência: 4

Constituição inicial: 60

Fala quando sóbrio: "Let them come. There is one Dwarf yet in Moria who still draws breath."

Fala quando bêbado: "What did I say? He can't hold his liquor!"
                
Se `beber` 3 vezes troca a fala de sóbrio para bêbado.

Faz parte da sociedade do anel.

toString: I

### Boromir

![](https://media.giphy.com/media/smW5FBep69d3q/giphy.gif)

**Guerreiro Humano**

Força: 7

Agilidade: 6

Inteligência: 3

Constituição inicial: 40

Fala: "One does not simply walk into Mordor."

Ao `envelhecer` recebe 2 de dano.

Faz parte da sociedade do anel.

toString: B

### Saruman

![](https://media.giphy.com/media/4NQ9mR6sh8LoA/giphy.gif)

**Mago Maia**

Força: 2

Agilidade: 2

Inteligência: 9

Constituição inicial: 70

Fala: "Against the power of Mordor there can be no victory."

Ao `ressucitar`, só retorna null.

toString: S

### Orc

![](https://media.giphy.com/media/8v3WIOCM9Qy08/giphy.gif)

**Guerreiro Monstro**

Força: 7

Agilidade: 4

Inteligência: 1

Constituição inicial: 30

Grunhido: "Arrrggghhh"

toString: O

### Goblim

![](https://pa1.narvii.com/6027/efe67547bb8d67178e8d2f4cdb4836606579e5d7_hq.gif)

**Arqueiro Monstro**

Força: 3

Agilidade: 6

Inteligência: 1

Constituição inicial: 20

Grunhido: "Iiisshhhh"

toString: M

### Urukhai

![](https://media.giphy.com/media/ckw8EbI8Ak9YQ/giphy.gif)

**Guerreiro Monstro e Humano**

Força: 8

Agilidade: 6

Inteligência: 3

Constituição inicial: 45

Grunhido: "Uuurrrrrr"

Fala: "Looks like meat's back on the menu boys!"

Ao `envelhecer` recebe 2 de dano.

toString: U

## Raças

Raças permitem que os personagens tenham comportamentos específicos.

### Anão

Todo Anão deve poder `beber`, causando alguma mudança para aquele personagem.

Também pode `falar`, que retorna uma String com uma fala daquele personagem. 

### Elfo

Elfos conseguem `falarElfico`, que retorna uma String com uma frase específica daquele personagem.

Também pode `falar`, que retorna uma String com uma fala daquele personagem. 

### Humano

Humanos devem `envelhecer`, causando algum dano a constituição do personagem.

Também pode `falar`, que retorna uma String com uma fala daquele personagem. 

### Maia

Maias podem `ressucitar`, porém cada Maia possui uma regra para isto acontecer.

Também pode `falar`, que retorna uma String com uma fala daquele personagem. 

### Monstro

Monstros são criaturas bestiais que só sabem `grunir`, retorna uma String com um determinado som que aquela criatura faz.

## Parte 2

## Mapa

![](https://images-na.ssl-images-amazon.com/images/I/71K87E-HOUL._AC_SX522_.jpg)

O mapa representa o caminho que os personagens vão percorrer, é composto de 10 posições de personagens e obrigatoriamente deve possuir estes métodos:

- `String exibir()`: retorna uma String com as 10 posições do mapa: 

Ex. 1: O mapa está vazio: `| | | | | | | | | | |`

Ex. 2: O mapa está populado com Aragorn na 1ª posição e Saruman na 10ª posição: `|A| | | | | | | | |S|`

Ex. 3: Mapa com Legolas, Gimli, Orc e Goblim: `| |L| |I| | |O| | |M|`

- `void inserir(int posicao, Personagem personagem)`: adiciona o personagem naquela posição do mapa. Este método pode lançar duas Exceptions:

PosicaoOcupadaException: se na posição passada como parâmetro já existir um personagem.

PersonagemJaEstaNoMapaException: se aquele mesmo personagem passada como parâmetro já existir no mapa.
  
- `int buscarPosicao(Personagem personagem)`: retorna a posição daquele personagem no mapa. Deve lançar a Exceção:

PersonagemNaoEncontradoNoMapaException: se aquele personagem não existir no mapa.
   
- `Personagem buscarCasa(int posicao)`: busca o personagem naquela posição, pode não existir um personagem lá.

**Importante: Garantir que um personagem morto (constituição = 0) não apareça no mapa.**

## Parte 3

## Classes

Para que um personagem possa se movimentar e atacar, ele precisa ser de uma das 3 classes. Personagens que fazem parte da Sociedade do Anel se movimentam para a direita, outros 
personagens se movimentam para a esquerda.

Ex. 1: Aragorn começa na esquerda e deve se movimentar para direita `|A| | | | | | | | | |` >> 

Ex. S: Saruman começa da direita e deve se movimentar para esquerda `| | | | | | | | | |S|` <<

Personagens que fazem parte da Sociedade do Anel não atacam outros membros da Sociedade e os outros personagens atacam apenas membros da Sociedade.

### Mago

O ataque de um mago equivale a sua **inteligência**, quando atacar causa dano a **todos os personagens inimigos**:

Ex. 1: Gandalf ataca Orc, Goblim e Saruman `| | |G| |O| | |M| |S|` dano 10.

Ex. 2: Saruman ataca Aragorn e Boromir `| |A| |B| | | | |S| |` dano 9.

Ex. 3: Gandalf não ataca ninguém porque não há inimigos `| | |G| | |B| | | | |`

Um mago só se movimenta quando não existir nenhum outro personagem no mapa, seu avanço é sempre de uma única posição:

Ex. 1: Gandalf pode avançar uma posição `| | |G| | | | | | | |`

Ex. 2: Saruman não pode avançar porque existem outros personagens no mapa `| |A| | | | | |S| | |`

Ex. 3: Gandalf não pode avançar porque existem outros personagens no mapa `|G| | | | | | |B| | |`

### Guerreiro

Um guerreiro ataca apenas personagens **inimigos próximos a ele**:

Ex. 1: Aragorn ataca um Orc `| | |A|O| | | | | | |` dano 20.

Ex. 2: Gimli não ataca um Orc `| |I| |O| | | | | | |`

Ex. 3: Urukhai ataca Boromir `| | | | | |B|U| | | |` dano 16.

O dano causado pelo guerreiro equivale a **2x sua força**.

Sempre que existir uma posição livre na frente do guerreiro ele deve se movimentar para lá:

Ex. 1: Boromir pode avançar uma casa nesta rodada `| | |B| | | | | |O| |`

Ex. 2: Gimli não pode avançar porque Aragorn está na sua frente `| |I|A| | | | | | | |`

Ex. 3: Orc pode avançar esta rodada `| | |A| | | |O|S| | |`

### Arqueiro

Arqueiros conseguem atacar a distância, até 3 posições na frente. O dano é calculado pela **distancia x a agilidade** do arqueiro:

**Importante: Um arqueiro deve sempre tentar atacar o alvo mais distante primeiro, ou seja, a 3ª posição, se não houver um inimigo lá deve tentar a 2ª posição, e assim por diante.**

Ex. 1: Legolas ataca um Orc `| | |L|U| |O| | | | |` dano 30.

Ex. 2: Legolas ataca um Orc `| |L|O| | | | | | | |` dano 10.

Ex. 3: Goblim ataca Gimli `| | | |G| |M| | | | |` dano 12.

Arqueiros conseguem avançar duas casas por turno, porém se existir algum outro personagem na 2ª posição, avançam apenas uma:

Ex. 1: Legolas pode avançar duas casa nesta rodada `| | |L| | | | | |O| |`

Ex. 2: Legolas só avança uma casas porque Aragorn está na sua frente `| |L| |A| | | | | | |`

Ex. 3: Goblim avança duas casas `| | |A| | | | |M| | |`

## Parte 4

## Simulador

![](https://steamuserimages-a.akamaihd.net/ugc/947345921269591445/82F23ECFC2088F1E803BB1401C735424FFA78418/)

O Simulador recebe um Mapa e possui um único método público:

- `void simular()`: deve percorrer o mapa da esquerda para direita, realizando o turno de cada personagem. No seu turno um personagem ataca e depois se movimenta (ambos respeitando
as regras de sua classe). Após todos os personagens realizarem seus turnos, o ciclo reinicia até que uma das condições de vitória seja atingida:

**Vitória para a Sociedade do Anel**: se algum membro da Sociedade chegar até a última posição do mapa (posição 9).

**Vitória para Sauron**: se não existir nenhum membro da Sociedade do Anel no mapa. Neste caso deve ser lançada uma Exception **SauronDominaOMundoException** com a descrição 
"A humanidade sofre perante a tirania de Sauron.".

**Importante: Comportamentos de raças não precisam ser utilizados durante a simulação**

## Exemplos de testes

```
@Test
public void deveVencerSociedadeQuandoAragornELegolasBatalharemContraOrcEGoblim()
        throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
    // Início:  "|A|L| | | | | |O| |M|"
    String resultadoEsperado = "| | | | |A| | | | |L|";

    Aragorn aragorn = new Aragorn();
    Legolas legolas = new Legolas();
    Orc orc = new Orc();
    Goblim goblim = new Goblim();
    Mapa mapa = new Mapa();
    Simulador simulador = new Simulador(mapa);

    mapa.inserir(0, aragorn);
    mapa.inserir(1, legolas);
    mapa.inserir(7, orc);
    mapa.inserir(9, goblim);
    simulador.simular();

    Assert.assertEquals(resultadoEsperado, mapa.exibir());
}

@Test(expected = SauronDominaOMundoException.class)
public void deveLancarSauronDominaOMundoExceptionQuandoInimigosDerrotaremMembrosDaSociedade()
        throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
    // Início: "|A| |I| | | | |U|O|G|"
    // Fim:    "| | | | | | |O|M| | |"

    Aragorn aragorn = new Aragorn();
    Gimli gimli = new Gimli();
    Urukhai urukhai = new Urukhai();
    Orc orc = new Orc();
    Goblim goblim = new Goblim();
    Mapa mapa = new Mapa();
    Simulador simulador = new Simulador(mapa);

    mapa.inserir(0, aragorn);
    mapa.inserir(2, gimli);
    mapa.inserir(7, urukhai);
    mapa.inserir(8, orc);
    mapa.inserir(9, goblim);
    simulador.simular();
}

@Test
public void deveVencerSociedadeQuandoGandalfBatalharSozinhoContraSaruman()
        throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
    // Início:  "|G| | | | | | | | |S|"
    String resultadoEsperado = "| | | | | | | | | |G|";

    Gandalf gandalf = new Gandalf();
    Saruman saruman = new Saruman();
    Mapa mapa = new Mapa();
    Simulador simulador = new Simulador(mapa);

    mapa.inserir(0, gandalf);
    mapa.inserir(9, saruman);
    simulador.simular();

    Assert.assertEquals(resultadoEsperado, mapa.exibir());
}

@Test(expected = SauronDominaOMundoException.class)
public void deveLancarSauronDominaOMundoExceptionQuandoLegolasBatalharSozinhoContraOrcEUrukhai()
        throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
    // Início:  "|L| | | | | | | |U|O|"
    // Fim:     "| | | | | |U| | | | |";

    Legolas legolas = new Legolas();
    Orc orc = new Orc();
    Urukhai urukhai = new Urukhai();
    Mapa mapa = new Mapa();
    Simulador simulador = new Simulador(mapa);

    mapa.inserir(0, legolas);
    mapa.inserir(8, urukhai);
    mapa.inserir(9, orc);
    simulador.simular();
}

@Test(expected = SauronDominaOMundoException.class)
public void deveLancarSauronDominaOMundoExceptionQuandoBoromirBatalharSozinhoContraUrukhai()
        throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
    // Início:  "|B| | | | | | | | |U|"
    // Fim:     "| | | | |U| | | | | |";

    Boromir boromir = new Boromir();
    Urukhai urukhai = new Urukhai();
    Mapa mapa = new Mapa();
    Simulador simulador = new Simulador(mapa);

    mapa.inserir(0, boromir);
    mapa.inserir(9, urukhai);
    simulador.simular();
}
```

## Testes Obrigatórios

* Devem existir **obrigatóriamente** na solução entregue testes unitários com os seguintes nomes:

    - deveVencerSociedadeQuandoAragornELegolasBatalharemContraOrcEGoblim
    - deveLancarSauronDominaOMundoExceptionQuandoInimigosDerrotaremMembrosDaSociedade
    - deveVencerSociedadeQuandoGandalfBatalharSozinhoContraSaruman
    - deveLancarSauronDominaOMundoExceptionQuandoLegolasBatalharSozinhoContraOrcEUrukhai
    - deveLancarSauronDominaOMundoExceptionQuandoBoromirBatalharSozinhoContraUrukhai
