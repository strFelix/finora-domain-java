import model.*;
import model.enums.CategoryType;
import model.enums.TransactionType;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // --- Instância 1: User ---
        User user = new User("Lucas", "Lucas@example.com", "senhaSegura123");

        // Invocando alguns métodos de domínio do User
        user.login("Lucas@example.com", "senhaSegura123");
        user.updateProfile("Lucas Felix", "Felix@example.com");
        user.changePassword("senhaSegura123", "novaSenha@2025");
        user.updatePreferences(new Preferences("theme=dark;lang=pt-BR"));
        user.logout();

        // --- Preparação para Transaction: Category e Local ---
        Category food = new Category(
                user,
                "Alimentação",
                CategoryType.FOOD,
                null,
                "#FF9900",
                false
        );

        Local mercado = new Local(
                user,
                "Mercado Central",
                "Market",
                "Rua das Flores, 123 - SP",
                "-23.5505,-46.6333",
                LocalDateTime.now()
        );

        // --- Instância 2: Transaction ---
        Transaction compraMes = new Transaction(
                user,
                food,
                mercado,
                150.75,
                LocalDateTime.now(),
                "Compra do mês",
                TransactionType.EXPENSE,
                1,
                3
        );

        // Invocando métodos da Transaction
        compraMes.updateValue(160.00);
        compraMes.changeCategory(food);
        compraMes.changeLocal(mercado);
        compraMes.updateDescription("Compra do mês (itens adicionais)");
        compraMes.markAsRecurring();
        compraMes.processInstallment();
        compraMes.cancelTransaction();

        // ações na Category e Local 
        food.markAsDefault();
        mercado.markAsUsed();

        // Fim do teste
        System.out.println("Main: execução de teste concluída.");
    }
}