package model;

public class Preferences {
    private int id;
    private String preferences;

    public Preferences() {
    }

    public Preferences(String preferences) {
        this.id = generateId();
        this.preferences = preferences;
    }

    public void updatePreferences(String preferences) {
        System.out.println("Preferences.updatePreferences(): preferências atualizadas");
    }

    public void resetPreferences() {
        System.out.println("Preferences.resetPreferences(): preferências redefinidas para padrão");
    }

    private static int generateId() {
        System.out.println("Preferences.generateId(): gerando ID das preferências");
        return 0;
    }
}
