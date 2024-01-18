package jpa.padroesPersistencia;

public class MapeamentoObjetoRelacional {
/*
    Object Relational Mapper:
        - Classe: Definimos uma classe que contém um conjunto de atributos.
        - Tabela: Temos uma tabela com suas respectivas colunas, restrições e tipos de dados.
        - Um atributo da classe corresponde a uma coluna da tabela.
        - Uma instância da classe corresponde a uma linha da tabela.
        - No JPA, utilizamos Annotations, como @Table(nome da tabela), para realizar o mapeamento entre a classe e a tabela, e para mapear os atributos e colunas, usamos do @Column.
        - Usamos @Id para indicar que um atributo representa a chave primária da tabela.
        - A Annotation @Column indica que um atributo representa uma determinada coluna da tabela.
        - O Hibernate/JPA transforma internamente a classe mapeada em comandos SQL válidos. O CRUD é realizado pelo framework de persistência, e utilizamos os métodos fornecidos pelo framework sem a necessidade de lidar diretamente com comandos SQL. O Hibernate fornece implementações concretas das interfaces definidas pelo JPA.
        - O JPA pode criar as tabelas com base na configuração.
        - As colunas podem ter restrições, como PK, FK, UNIQUE, NOT NULL e NULL, que são úteis ao criar as tabelas, mas não são validadas durante a persistência. Para validação dos dados, é recomendável utilizar outra biblioteca baseada em Annotations
        - @Table
        - @Id
        - @Entity
        - @Column
        - @GeneretedValue
*/
}
