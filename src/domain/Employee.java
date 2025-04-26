package domain;

/**
 * Клас {@code Employee} представляє співробітника організації.
 * Він містить основну інформацію про співробітника, таку як ім'я,
 * посада, рівень, відділ та унікальний ідентифікатор.
 */
public class Employee {

    /**
     * Ім'я співробітника.
     */
    private String name;

    /**
     * Посада співробітника.
     */
    private String jobTitle;

    /**
     * Унікальний ідентифікатор співробітника.
     */
    private int ID;

    /**
     * Рівень співробітника в організації (1, 2 або 3).
     */
    private int level;

    /**
     * Відділ, у якому працює співробітник.
     */
    private String dept;

    /**
     * Повертає рядкове представлення об'єкта {@code Employee},
     * включаючи ID, ім'я, посаду, рівень та відділ.
     *
     * @return Рядкове представлення співробітника.
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    /**
     * Конструктор класу {@code Employee}, який ініціалізує співробітника
     * з вказаними параметрами.
     *
     * @param name     Ім'я співробітника.
     * @param jobTitle Посада співробітника.
     * @param level    Рівень співробітника (1, 2 або 3).
     * @param dept     Відділ, у якому працює співробітник.
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Конструктор класу {@code Employee} за замовчуванням.
     * Генерує випадковий унікальний ідентифікатор для співробітника.
     */
    public Employee() {
        ID = (int)(Math.random() * 1000);
    }

    /**
     * Встановлює посаду співробітника.
     *
     * @param job Посада співробітника.
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає посаду співробітника.
     *
     * @return Посада співробітника.
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я співробітника.
     *
     * @return Ім'я співробітника.
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень співробітника.
     * Якщо рівень не є 1, 2 або 3, встановлюється рівень за замовчуванням (1).
     *
     * @param level Рівень співробітника.
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень співробітника.
     *
     * @return Рівень співробітника.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає відділ, у якому працює співробітник.
     *
     * @return Відділ співробітника.
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює відділ, у якому працює співробітник.
     *
     * @param dept Відділ співробітника.
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я співробітника.
     * Якщо ім'я не відповідає шаблону, встановлюється значення за замовчуванням "John Doe".
     *
     * @param name Ім'я співробітника.
     */
    public void setName(String name) {
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
