import java.util.Scanner;

public class Figuras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Esfera");
            System.out.println("2. Paralelepípedo");
            System.out.println("3. Cono");
            System.out.println("4. Cilindro");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            
           switch (opcion) {
    case 1 -> esfera(scanner);
    case 2 -> paralelepipedo(scanner);
    case 3 -> cono(scanner);
    case 4 -> cilindro(scanner);
    case 5 -> {}
    default -> System.out.println("Opción inválida");
            }
        }
    }

    public static void esfera(Scanner scanner) {
        System.out.print("Ingresa el radio de la esfera: ");
        double radio = scanner.nextDouble();
        double area = 4 * Math.PI * Math.pow(radio, 2);
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Volumen: %.2f%n", volumen);
        System.out.print("Las esferas son objetos tridimensionales y no tienen perimetro");
   }

    public static void paralelepipedo(Scanner scanner) {
        System.out.print("Ingresa el largo del paralelepípedo: ");
        double largo = scanner.nextDouble();
        System.out.print("Ingresa el ancho del paralelepípedo: ");
        double ancho = scanner.nextDouble();
        System.out.print("Ingresa el alto del paralelepípedo: ");
        double alto = scanner.nextDouble();
        double area = 2 * (largo * ancho + largo * alto + ancho * alto);
        double volumen = largo * ancho * alto;
        double perimetro = 4 * (largo + ancho + alto);
        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Volumen: %.2f%n", volumen);
        System.out.printf("Perímetro: %.2f%n", perimetro);
    }

    public static void cono(Scanner scanner) {
        System.out.print("Ingresa el radio del cono: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingresa la altura del cono: ");
        double altura = scanner.nextDouble();
        double area = Math.PI * radio * (radio + Math.sqrt(Math.pow(altura, 2) + Math.pow(radio, 2)));
        double volumen = (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
        double perimetro = 2 * Math.PI * radio;
        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Volumen: %.2f%n", volumen);
        System.out.printf("Perímetro de la base: %.2f%n", perimetro);
    }

    public static void cilindro(Scanner scanner) {
        System.out.print("Ingresa el radio del cilindro: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingresa la altura del cilindro: ");
        double altura = scanner.nextDouble();
        double area = 2 * Math.PI * radio * (radio + altura);
        double volumen = Math.PI * Math.pow(radio, 2) * altura;
        double perimetro = 2 * Math.PI * radio;
        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Volumen: %.2f%n", volumen);
        System.out.printf("Perímetro de la base: %.2f%n", perimetro);
    }
}