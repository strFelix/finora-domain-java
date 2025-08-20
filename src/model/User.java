package model;

import java.time.LocalDateTime;

public class User {
    private int id;
    private String name;
    private String email;
    private String passwordHash;
    private String passwordSalt;
    private LocalDateTime creationDate;
    private LocalDateTime lastLoginDate;
    private boolean active;
    private Preferences preferences;

    public User() {
        System.out.println("User(): construtor padrão chamado");
    }

    public User(String name, String email, String plainPassword) {
        System.out.println("User(String, String, String): criando usuário");
        this.id = generateId();
        this.name = name;
        this.email = email;
        this.passwordSalt = generateSalt();
        this.passwordHash = hashPassword(plainPassword, this.passwordSalt);
        this.creationDate = LocalDateTime.now();
        this.lastLoginDate = null;
        this.active = true;
        this.preferences = new Preferences();
    }

    public void login(String email, String plainPassword) {
        System.out.println("User.login(): usuário realizou login");
    }

    public void logout() {
        System.out.println("User.logout(): usuário realizou logout");
    }

    public void changePassword(String oldPassword, String newPassword) {
        System.out.println("User.changePassword(): solicitação de troca de senha registrada");
    }

    public void updateProfile(String newName, String newEmail) {
        System.out.println("User.updateProfile(): atualização de nome/email solicitada");
    }

    public void updatePreferences(Preferences preferences) {
        System.out.println("User.updatePreferences(): preferências atualizadas");
    }

    public void deactivate() {
        System.out.println("User.deactivate(): conta desativada");
    }

    private static int generateId() {
        System.out.println("User.generateId(): gerando ID do usuário");
        return 0;
    }

    private static String generateSalt() {
        System.out.println("User.generateSalt(): gerando salt da senha");
        return "";
    }

    private static boolean validateEmail(String email) {
        System.out.println("User.validateEmail(): validando formato do email");
        return true;
    }

    private static String hashPassword(String password, String salt) {
        System.out.println("User.hashPassword(): gerando hash da senha");
        return "";
    }

    private static boolean verifyPassword(String plain, String salt, String hash) {
        System.out.println("User.verifyPassword(): verificando senha informada");
        return true;
    }
}
