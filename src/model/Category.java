package model;

import model.enums.CategoryType;

public class Category {
    private int id;
    private User user;
    private String description;
    private CategoryType type;
    private Byte[] icon;
    private String colorHex;
    private boolean isDefault;

    public Category() {}

    public Category(User user, String description, CategoryType type, Byte[] icon, String colorHex, boolean isDefault) {
        this.id = generateId();
        this.user = user;
        this.description = description;
        this.type = type;
        this.icon = icon;
        this.colorHex = colorHex;
        this.isDefault = isDefault;
    }

    public void updateCategory(String newDescription, CategoryType newType) {
        System.out.println("Category.updateCategory(): atualização de categoria solicitada");
    }

    public void assignToUser(User user) {
        System.out.println("Category.assignToUser(): categoria atribuída ao usuário");
    }

    public void removeCategory() {
        System.out.println("Category.removeCategory(): categoria removida");
    }

    public void markAsDefault() {
        System.out.println("Category.markAsDefault(): categoria definida como padrão");
    }

    public static int generateId() {
        System.out.println("Category.generateId(): gerando ID da categoria");
        return 0;
    }
}
