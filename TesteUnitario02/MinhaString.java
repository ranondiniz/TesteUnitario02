public class MinhaString {
    public String inverterString(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public boolean verificaPalindromo(String str){
        return str.equals(inverterString(str));
    }
}