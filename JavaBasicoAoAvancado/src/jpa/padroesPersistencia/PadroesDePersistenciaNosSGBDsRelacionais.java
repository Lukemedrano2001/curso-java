package jpa.padroesPersistencia;

public class PadroesDePersistenciaNosSGBDsRelacionais {
/*
    DataMapper:
        - Padrão utilizado pelo JPA no Java.
        - Dependemos de um DAO para realizar a persistência no banco de dados.
        - Podemos ter vários objetos, cada um com seus atributos, relacionados a tabelas no banco de dados. Isso pode ser feito por meio de mecanismos como arquivos XML, JSON ou Annotations.
        - Utilizamos um mecanismo para mapear cada objeto para uma tabela específica, e para cada atributo do objeto, realizamos um mapeamento para colunas específicas na tabela.
*/
	
	
/* 
    Active Record:
        - Padrão utilizado pelo Ruby On Rails no Ruby.
        - Não dependemos de um DAO para realizar a persistência no banco de dados.
        - Criamos uma classe que representa uma tabela no banco de dados relacional, com atributos e métodos. Essa classe pode ser usada para estabelecer relacionamentos entre tabelas (1 para 1, 1 para N, N para N).
        - Todos os métodos necessários para a persistência no banco de dados são implementados dentro da classe. Geralmente, usa-se herança da classe ActiveRecord, que contém os métodos necessários para serem herdados pelas classes que precisam de persistência. 
        - Esses métodos são estáticos, pois para realizar o CRUD no banco de dados, utilizamos a classe e não uma instância da classe.
        - Exemplos de métodos incluem save, insert, remove e find, contendo os comandos SQL necessários para a persistência.
*/
}