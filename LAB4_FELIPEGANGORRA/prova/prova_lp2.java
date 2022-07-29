/**
 

Unidade Acadêmica de Sistemas e Computação
Laboratório de Programação 2 - 2021.2
Professorxs: Lívia Sampaio, Matheus Gaudêncio e Reinaldo Gomes

Prova 1 - T1 - 29/06/2022

Aluno(a): _________________________________________________

Muitos forrozeiros já vivenciaram a situação de ficar dando voltas e voltas no entorno do Parque do Povo em Campina Grande em busca de uma vaga para estacionar seus veículos. Pensando em contribuir para uma diversão com menos estresse possível, os profs de LP2 estão lançando o desafio do EstacionAqui, um sistema para facilitar a busca por vagas de estacionamento na cidade. Queremos ver sua solução! 


Não será necessário implementar um Main.
1. O EstacionAqui disponibiliza para seus usuários vagas de estacionamento em vários pontos da cidade. Cada vaga tem um endereço (nome da rua e bairro) e uma numeração (valor de 0 a 99) atribuída pelo próprio sistema no momento da criação das vagas. Existe ainda uma informação que é o link para uma localização no GoogleMaps, mas tal informação é opcional. Todas as vagas tem um valor padrão de R$3,00 por hora de uso, porém cada vaga tem uma área (m2) que vai influenciar no valor cobrado por seu uso (qtd_horas * 3 + 0.1*area). As vagas tem status de livre ou ocupada, estando todas livres ao serem criadas. 

A representação textual de uma vaga é da seguinte forma:
ID - endereço - link para GoogleMaps* - LIVRE ou OCUPADA
* se não houver link aparece o texto “https://”


Duas vagas são iguais se tiverem o mesmo endereço e área.

2. O nosso estacionamento virtual tem capacidade para 100 vagas. O registro das vagas é sob demanda, ou seja, a medida que forem surgindo. As seguintes funcionalidades são disponibilizadas pelo sistema:
Adicionar vagas: as vagas são criadas e associadas ao estacionamento. Lembrar que é obrigatório informar para cada vaga, a sua área e endereço, sendo opcional o link para GoogleMaps (nesse caso, o valor padrão para o link será o texto “https://”).Ex.
ADD_VAGA “Rua dr Joao Moura, Sao Jose” 13.75
0
ADD_VAGA “Rua dr Joao Moura, Sao Jose” “https://goo.gl/maps/raoKQyjFmS7kfKnu8” 9.87
1
Mudar status da vaga: as vagas são criadas como livres e depois podem se tornar ocupadas/livres.Ex.
MUDAR_STATUS 0 
Simular preço da vaga: dada o ID da vaga e uma quantidade de horas é possível saber qual o valor daquela vaga. Ex.
SIMULAR_PRECO 0 3
10.37
As seguintes verificações devem ser feitas: O ID da vaga deve ser entre 0 e 99 e esta vaga deve se encontrar ativa e a quantidade de horas deve ser maior ou igual a zero.
Para todos os casos, uma exceção do tipo IllegalArgumentException deve ser lançada caso as verificações falhem.
Informar vagas ativas: indica a quantidade de vagas já cadastradas no sistema.
VAGAS_ATIVAS
2
Informar vaga livre: indica o ID da próxima vaga livre ou -1 se não houverem mais vagas livres.
VAGA_LIVRE
1
Informar uma vaga livre em um dado endereço e com determinada área: indica o ID da próxima vaga livre com endereço e área iguais a uma outra vaga passada como parâmetro, ou -1 se não houverem mais vagas livres.
VAGA_LIVRE “Rua dr Joao Moura, Sao Jose” 13.75
-1
Informar relatório de uso das vagas: emite um relatório com a listagem das vagas e a quantidade de vezes que cada uma foi ocupada.
RELATORIO
Vaga 0 - 1
Vaga 1 - 0
Listar vagas ativas: informa uma descrição textual de todas as vagas cadastradas no estacionamento.
LISTAR_VAGAS
0 - Rua dr Joao Moura, Sao Jose - https:// - OCUPADA
1 - Rua dr Joao Moura, Sao Jose - https://goo.gl/maps/raoKQyjFmS7kfKnu8 - LIVRE

3. Os clientes podem ainda fazer comentários sobre os serviços oferecidos pelo EstacionAqui. Cada comentário tem um texto e um autor (opcional). O sistema guarda apenas 5 comentários, assim, os 5 comentários mais recentes. Ex.

ADD_COMENTARIO “Estacionamento muito seguro” “Livia Campos”
ADD_COMENTARIO “Muito util. Recomendo.”
LISTAR_COMENTARIOS
Estacionamento muito seguro (Livia Campos)
Muito util.Recomendo. ()

4. Faça testes de unidade para as funcionalidades de informar vaga livre do EstacionAqui.Para fins de teste vc pode considerar o estacionamento com capacidade de 10 veículos.

Não é necessário implementar Main. Use o Junit para exercitar o seu programa!
Observação: Você está livre para incluir métodos e atributos (além dos mencionados, que são obrigatórios) em suas classes. Decida que métodos de acesso e modificadores são necessários.

 */