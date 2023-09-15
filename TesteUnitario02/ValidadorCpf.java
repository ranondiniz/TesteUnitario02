public class ValidadorCpf {
    public static String formatarCpf(String cpf){
        return cpf.replace(".", "").replace("-", "");
    }

    public static int contadorDigitos(String cpf){
        String cpfFormatado = formatarCpf(cpf);
        return cpfFormatado.length();
    }

    public static boolean validarCpf(String cpf){
        if(contadorDigitos(cpf) != 11){
            return false;
        }else {
            return true;
        }
    }
}
