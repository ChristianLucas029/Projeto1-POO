# Projeto POO - Sistemas Integrados de Gerenciamento

## Alunos: Christian Lucas e Dayvison Gabriel

O objetivo do projeto proposto é desenvolver uma aplicação em Java que simule três sistemas de gerenciamento: uma clínica médica, um sistema de eventos e um restaurante. A aplicação será construída utilizando classes e objetos para modelar os principais elementos de cada cenário, aplicando conceitos de programação orientada a objetos, como encapsulamento, métodos e estruturas de decisão.

O sistema de gerenciamento da clínica médica permitirá agendar consultas, buscar pacientes e gerar relatórios. Já o sistema de eventos será capaz de cadastrar eventos, registrar participantes e controlar a lotação dos eventos. O sistema de gerenciamento do restaurante irá registrar pedidos, calcular o total a pagar e gerenciar a ocupação das mesas. O encapsulamento será aplicado para proteger os dados confidenciais em todos os sistemas, garantindo a segurança e integridade das informações.

Além de desenvolver sistemas independentes para a clínica médica, o gerenciamento de eventos e o restaurante, este projeto também aborda a integração desses três cenários em uma aplicação coesa. A integração será feita por meio de uma classe principal que permitirá ao usuário navegar entre os sistemas de forma fluida. Ao escolher qual sistema utilizar, o usuário poderá realizar operações específicas de cada cenário e, posteriormente, acessar uma seção de perguntas estratégicas. Essas perguntas, elaboradas com base nos dados gerados pelos sistemas, têm como objetivo auxiliar na tomada de decisões estratégicas, como identificar os médicos mais procurados, os eventos com maior participação ou os itens de pedido mais populares no restaurante. Essa abordagem proporciona uma visão mais ampla e unificada do desempenho dos sistemas, contribuindo para otimizar a gestão e melhorar a eficiência.

### Caso 1 - Sistema de Gerenciamento Clínica Médica

O sistema de gerenciamento de clínica médica é projetado para facilitar a administração de pacientes, médicos e consultas. A estrutura é organizada em várias classes que interagem entre si para proporcionar funcionalidades específicas. A classe Paciente representa os pacientes do sistema, contendo atributos como nome e CPF. Ela oferece métodos para acessar essas informações, permitindo a manipulação de dados do paciente.

A classe Medico é responsável por representar os médicos disponíveis na clínica. Cada médico possui atributos como nome, especialidade e um array para armazenar as consultas agendadas. O sistema permite agendar consultas através do método agendarConsulta, que adiciona uma nova consulta, desde que o médico esteja disponível. O método isDisponivel verifica se o médico pode atender em uma data e horário específicos. Além disso, a classe fornece métodos para remover consultas e reorganizar as consultas.

A classe Consulta atua como um vínculo entre um paciente e um médico, armazenando detalhes como a data e a hora da consulta. Esta classe oferece métodos para exibir as informações da consulta de forma estruturada, facilitando a visualização e o gerenciamento das consultas agendadas.

Sendo assim, o sistema é uma solução coesa e funcional que integra a administração de pacientes, médicos e consultas, proporcionando uma experiência eficiente para a gestão de uma clínica médica. O sistema também implementa validações, como a verificação do formato do CPF, da data e da hora, garantindo que as informações inseridas sejam corretas e evitando erros na operação.

### Caso 2 - Sistema de Gerenciamento de Eventos

O sistema de gerenciamento de eventos é projetado para facilitar a organização e administração de eventos, permitindo o registro de participantes e o gerenciamento de informações relacionadas. A estrutura é organizada em várias classes que interagem entre si para fornecer funcionalidades específicas.

A classe Participante representa os participantes dos eventos, contendo atributos como nome, email e CPF. Ela oferece métodos para acessar essas informações, permitindo a manipulação dos dados do participante.

A classe Local é responsável por armazenar as informações sobre o local do evento, incluindo o nome e o endereço. Isso permite que cada evento esteja associado a um local específico, facilitando o gerenciamento logístico.

A classe Evento atua como um ponto central para o gerenciamento de eventos. Ela contém atributos como nome do evento, um objeto da classe Local para identificar o local, um array de participantes, o total de participantes registrados e a capacidade máxima do evento. O método verificarLotacao verifica se ainda há vagas disponíveis. O método registrarParticipante permite adicionar um novo participante ao evento, enquanto o método excluirParticipante remove um participante com base no CPF. A classe também possui o método listarParticipantes, que exibe todos os participantes registrados para o evento.

Resumindo, o sistema de gerenciamento de eventos é uma solução eficiente que integra a administração de participantes e eventos, proporcionando uma experiência organizada para a gestão de eventos e facilitando o acompanhamento das informações dos participantes e locais.
O sistema implementa validações, como a verificação do formato do CPF, garantindo que as informações inseridas sejam corretas e evitando erros durante o registro de participantes.

### Caso 3 - Sistema de Gerenciamento de Restaurante

O sistema de gerenciamento de pizzaria é projetado para facilitar a administração de pedidos e mesas, permitindo um atendimento eficiente aos clientes e uma melhor organização das operações. A estrutura é organizada em várias classes que interagem entre si para fornecer funcionalidades específicas.

A classe ItemDoPedido representa os itens que podem ser pedidos, contendo atributos como nome e preço. Ela oferece métodos para acessar essas informações, permitindo a manipulação dos dados do item.

A classe Mesa é responsável por armazenar as informações sobre cada mesa, incluindo o número da mesa, se está ocupada, o pedido atual e um histórico de pedidos. Isso permite que cada mesa esteja associada a um estado específico, facilitando o gerenciamento do espaço do
restaurante.

A classe Pedido atua como um ponto central para o gerenciamento dos pedidos feitos em uma mesa. Ela contém um array de itens do pedido e métodos para adicionar e remover itens, calcular o total do pedido e listar os itens. O método calcularTotal permite verificar o valor total do pedido, enquanto listarItens exibe todos os itens registrados para aquele pedido.

O sistema de gerenciamento de pizzaria é uma solução eficiente que integra a administração de pedidos e mesas, proporcionando uma experiência organizada para a gestão do restaurante e facilitando o atendimento aos clientes. O sistema implementa validações, como a verificação do estado das mesas, garantindo que a ocupação e os pedidos sejam gerenciados corretamente.

### Integração dos Sistemas de Gerenciamentos

O código implementa um sistema integrado de gerenciamento que permite ao usuário acessar três módulos distintos: gerenciamento de clínica, gerenciamento de eventos e gerenciamento de restaurante. A estrutura é organizada em um loop que exibe um menu, permitindo que o
usuário escolha entre as opções disponíveis. Cada módulo é chamado através de suas respectivas classes (Clinica, GerenciarEvento e Restaurante), que contêm a lógica específica para gerenciar as funcionalidades de cada sistema. O programa continua em execução até que o usuário opte por sair, garantindo uma experiência interativa e fluida.

### Conclusão

Este projeto de integração dos sistemas de gerenciamento de clínica, eventos e restaurante foi desenvolvido como uma experiência prática para aplicar conhecimentos teóricos em programação em Java. Através da criação de uma interface única, o projeto demonstrou como
diferentes módulos podem interagir de maneira eficiente, facilitando a administração de diversas áreas. Essa experiência proporcionou uma compreensão mais aprofundada sobre a importância da modularidade e da organização em projetos de software. Com esse trabalho, foi
possível desenvolver habilidades de programação e colaboração, essenciais para o futuro profissional na área de tecnologia. O projeto serve como uma base para aprimoramentos futuros e para a exploração de novos conhecimentos.
