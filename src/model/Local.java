package model;

import java.time.LocalDateTime;

public class Local {
    private int id;
    private User user;
    private String name;
    private String type;
    private String address;
    private String coordinates;
    private LocalDateTime lastUsed;

    public Local() {}

    public Local(User user, String name, String type, String address, String coordinates, LocalDateTime lastUsed) {
        this.id = generateId();
        this.user = user;
        this.name = name;
        this.type = type;
        this.address = address;
        this.coordinates = coordinates;
        this.lastUsed = lastUsed;
    }

    public void updateLocal(String name, String type, String address) {
        System.out.println("Local.updateLocal(): local atualizado");
    }

    public void markAsUsed() {
        System.out.println("Local.markAsUsed(): local marcado como utilizado");
    }

    public void removeLocal() {
        System.out.println("Local.removeLocal(): local removido");
    }

    private static int generateId() {
        System.out.println("Local.generateId(): gerando ID do local");
        return 0;
    }
}
