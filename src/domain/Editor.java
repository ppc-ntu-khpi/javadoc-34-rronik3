package domain;

/**
 * Клас {@code Editor} представляє редактора, який є художником.
 * Він успадковує клас {@code Artist} та додає специфічний атрибут
 * і методи, пов'язані з уподобаннями редагування (електронне чи паперове).
 */
public class Editor extends Artist {

    /**
     * Вказує, чи використовує редактор електронне редагування.
     */
    private boolean electronicEditing;

    /**
     * Конструктор класу {@code Editor}, який ініціалізує редактора
     * з вказаними параметрами.
     *
     * @param electronicEditing Вказує, чи використовує редактор електронне редагування.
     * @param skiils            Масив навичок редактора.
     * @param name              Ім'я редактора.
     * @param jobTitle          Посада редактора.
     * @param level             Рівень редактора в організації.
     * @param dept              Відділ, у якому працює редактор.
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор класу {@code Editor}, який ініціалізує редактора
     * з вказаними уподобаннями редагування та навичками.
     *
     * @param electronicEditing Вказує, чи використовує редактор електронне редагування.
     * @param skiils            Масив навичок редактора.
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор класу {@code Editor}, який ініціалізує редактора
     * лише з вказаними уподобаннями редагування.
     *
     * @param electronicEditing Вказує, чи використовує редактор електронне редагування.
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор класу {@code Editor} за замовчуванням.
     * Ініціалізує редактора з електронним редагуванням за замовчуванням.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядкове представлення об'єкта {@code Editor},
     * включаючи інформацію про художника та уподобання редагування.
     *
     * @return Рядкове представлення редактора.
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nEditing preferences= ";
        if (electronicEditing)
            s = s + "electronic";
        else
            s = s + "paper";
        return s;
    }

    /**
     * Повертає уподобання редагування редактора.
     *
     * @return {@code true}, якщо використовується електронне редагування,
     *         {@code false}, якщо паперове.
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює уподобання редагування редактора.
     *
     * @param electronic {@code true}, якщо використовується електронне редагування,
     *                   {@code false}, якщо паперове.
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
