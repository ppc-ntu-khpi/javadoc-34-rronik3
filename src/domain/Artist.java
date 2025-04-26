package domain;

/**
 * Клас {@code Artist} представляє художника, який є співробітником.
 * Він успадковує клас {@code Employee} та додає специфічні атрибути
 * і методи, пов'язані з художником, такі як навички.
 */
public class Artist extends Employee {

    /**
     * Масив навичок, які має художник.
     */
    private String[] skiils;

    /**
     * Конструктор класу {@code Artist}, який ініціалізує художника
     * з вказаними навичками, ім'ям, посадою, рівнем та відділом.
     *
     * @param skiils   Масив навичок художника.
     * @param name     Ім'я художника.
     * @param jobTitle Посада художника.
     * @param level    Рівень художника в організації.
     * @param dept     Відділ, у якому працює художник.
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Конструктор класу {@code Artist}, який ініціалізує художника
     * лише з вказаними навичками.
     *
     * @param skiils Масив навичок художника.
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Конструктор класу {@code Artist} за замовчуванням.
     * Ініціалізує масив навичок розміром 10.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Повертає рядкове представлення об'єкта {@code Artist},
     * включаючи інформацію про співробітника та навички художника.
     *
     * @return Рядкове представлення художника.
     */
    @Override
    public String toString() {
        return super.toString() + "\nSkills: " + getSkills();
    }

    /**
     * Повертає навички художника у вигляді рядка, розділеного комами.
     *
     * @return Рядок, що містить навички художника.
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює навички художника.
     *
     * @param skills Масив навичок для художника.
     */
    public void setSkills(String[] skills) {
        this.skiils = skills;
    }

    /**
     * Повертає навички художника у вигляді масиву.
     *
     * @return Масив навичок художника.
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
