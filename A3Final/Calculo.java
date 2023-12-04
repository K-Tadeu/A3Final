public class Calculo {

    public static double calcularMetabolismoBasal(double pesoEmKg, double altura, int idade, String sexo) {
        switch (sexo) {
            case "masculino":
                return 88.362 + (13.397 * pesoEmKg) + (4.799 + altura)
                        - (5.677 * idade);

            case "feminino":
                return 447.593 + (9.247 * pesoEmKg) + (3.098 * altura)
                        - (4.330 * idade);

            default:
                return 0;
        }
    }

    public static double calcularProteinas(Double pesoEmKg) {
        return pesoEmKg * 1.6;
    }

    public static double calcularCarboidratos(double pesoEmKg, double altura, int idade, String sexo) {
        return (calcularMetabolismoBasal(pesoEmKg, altura, idade, sexo) * 0.55) / 4;
    }

    public static double calcularImc(double pesoEmKg, double altura) {
        return pesoEmKg * Math.pow(altura * 100, 2);
    }

    public static double calcularQtdAgua(double pesoEmKg) {
        return 0.035 * pesoEmKg;
    }
}
