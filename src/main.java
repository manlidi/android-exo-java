package src;


class main {
    public static void main(String[] args) {
        Mangue m = new Mangue("Mangue", "Jaune");
        m.service();
        System.out.println(m.getCouleur());
        System.out.println(m.toString());
    }
}
