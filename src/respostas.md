# Respostas sobre Herança e POO em Java

## 1. Definição de Herança, Superclasse e Subclasse em Java
**Herança:**  
Herança é um mecanismo em programação orientada a objetos que permite que uma classe (subclasse) herde atributos e métodos de outra classe (superclasse). Esse conceito promove o reuso de código e a criação de uma hierarquia de classes.

**Superclasse:**  
A superclasse (ou classe base) é a classe da qual outra classe herda. Em Java, uma superclasse é definida simplesmente como uma classe normal, e a subclasse a estende. No exemplo dado, `Ponto2D` é a superclasse.

**Subclasse:**  
A subclasse é uma classe que estende outra (superclasse) e pode herdar seus métodos e atributos. Em Java, usamos a palavra-chave `extends` para definir uma subclasse. No exemplo dado, `Ponto3D` é a subclasse de `Ponto2D`.

**Definição em Java:**

```java
class Ponto2D {
    // Atributos e métodos
}

class Ponto3D extends Ponto2D {
    // Atributos e métodos adicionais
}
------------------------------------------------------------------------------------------------------------------------

2. Características de uma Subclasse ao Estender Outra Classe
Ao estender uma classe, a subclasse herda todos os atributos e métodos não privados da superclasse. Além disso, a subclasse pode sobrescrever (override) os métodos da superclasse para fornecer uma implementação específica. Também é possível adicionar novos atributos e métodos exclusivos à subclasse.

------------------------------------------------------------------------------------------------------------------------

3. Coesão e Acoplamento (Baseado na Leitura Requerida)
Coesão:
Refere-se ao grau em que os métodos e atributos de uma classe estão relacionados entre si e contribuem para a mesma finalidade. Alta coesão significa que a classe é focada em uma única responsabilidade ou tarefa.

Acoplamento:
Refere-se ao grau de dependência entre diferentes classes ou módulos de um sistema. Baixo acoplamento significa que as classes têm pouca dependência umas das outras, facilitando a manutenção e a escalabilidade do código.

Em um bom projeto, queremos:

Alta ou baixa coesão? Queremos alta coesão, para que cada classe tenha uma responsabilidade clara e específica.
Alto ou baixo acoplamento? Queremos baixo acoplamento, para minimizar dependências entre as classes, facilitando o teste e a manutenção do sistema.

------------------------------------------------------------------------------------------------------------------------

4. Implementação de Ponto2D e Ponto3D
Na classe Ponto2D, devemos implementar os métodos de acesso

(getX, getY) e de modificação (setX, setY). O método getXY deve retornar um array com os valores de x e y.

Na classe Ponto3D, além de herdar os métodos de Ponto2D, devemos adicionar z como atributo e implementar métodos como getZ, setZ, e getXYZ, que retorna um array com x, y e z.

------------------------------------------------------------------------------------------------------------------------


5. Palavra-chave final nos Métodos de Ponto2D
Declarar os métodos da classe Ponto2D como final impede que eles sejam sobrescritos (overridden) em subclasses, como Ponto3D. Se o projeto continuar funcionando mesmo com os métodos finais, isso significa que o comportamento herdado de Ponto2D é adequado para Ponto3D.

Faz sentido declarar esses métodos como final?
Depende do contexto do projeto maior. Se Ponto2D fornece um comportamento básico e completo que não deve ser alterado, pode fazer sentido. No entanto, em um cenário onde esperamos flexibilidade, como a extensão de funcionalidades, não seria ideal.