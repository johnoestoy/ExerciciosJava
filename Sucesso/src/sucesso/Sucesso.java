
package sucesso;

/**
 *
 * @author JOHN
 */
public class Sucesso {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Exercicio 1 e 2");
        Pessoa p = new Pessoa("john","boa vista","87664");
        p.imprimir();
        
        System.out.println("Exercicio 3 e 4");
        Quadrado q = new Quadrado(2);
        q.calculaArea();
        q.calculaPerimetro();
        q.imprimir();
        
        System.out.println("Exercicio 5 e 6");
        Retangulo r = new Retangulo(5,3);
        r.calcularArea();
        r.calcularPerimetro();
        r.imprimir();
        
        System.out.println("Exercicio 7 e 8");
        Circulo c = new Circulo (3.5);
        c.calcularArea();
        c.calcularPerimetro();
        c.imprimir();
        
        System.out.println("\nExercicio 9 - 16");
        Moto m = new Moto("yamaha", "z15", "vermelha", 0, 0, 5, true);
        m.imprimir();
        m.marcaAcima();
        m.marcaAcima();
        m.imprimir();
        m.desligar();
        m.imprimir();
        m.marchaAbaixo();
        m.marchaAbaixo();
        m.desligar();
        m.marchaAbaixo();
        m.imprimir();
        
        System.out.println("\nExercicio 17 - 19");
        Eletrodomestico e = new Eletrodomestico(true);
        e.imprimir();
        e.desligar();
        e.imprimir();
        
        System.out.println("\nExercicio 19 -25");
        Televisor t= new Televisor(true, 1, 27, 5, 30);
        t.ligar();
        t.canalAcima();
        t.imprimir();
        t.canalAcima();
        t.canalAcima();
        t.imprimir();
        t.canalAcima();
        t.imprimir();
        t.canalAcima();
        t.imprimir();
        t.canalAbaixo();
        t.imprimir();
        t.canalAcima();
        t.volumeAcima();
        t.imprimir();
        t.volumeAcima();
        t.volumeAcima();
        t.imprimir();
        t.volumeAcima();
        t.imprimir();
        t.volumeAbaixo();
        t.imprimir();
        
        System.out.println("\nExercicio 26-31");
        Microondas micro = new Microondas(true);
        micro.imprimir();
        micro.ligar();
        micro.imprimir();
        micro.abrirPorta();
        micro.desligar();
        micro.imprimir();
        micro.ligar();
        
        
        
    }
    
}
