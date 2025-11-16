public class App {
    public static void main(String[] args) throws Exception {
        int altura = 0;
        boolean primo = false;
        while (!primo) {
            altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura de la figura: "));
            for (int i = 1; i <= altura / 2; i++) {
                if (altura % i == 0) {
                    primo = false;
                } else {
                    primo = true;
                }
            }
            if (!primo) {
                System.out.println("La altura no es correcta, debe ser un número impar mayor o igual que 3.");
            }
        }

        for (int i = 0; i < altura / 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("*    *");
        }
        for (int i = altura / 2; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("*    *");
        }
    }
}
