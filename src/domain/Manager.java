package domain;

/**
 * Клас {@code Manager} представляє менеджера, який є співробітником.
 * Він успадковує клас {@code Employee} та додає можливість керувати
 * списком підлеглих співробітників.
 */
public class Manager extends Employee {

    /**
     * Масив співробітників, якими керує менеджер.
     */
    private Employee[] employees;

    /**
     * Конструктор класу {@code Manager}, який ініціалізує менеджера
     * з вказаними підлеглими, ім'ям, посадою, рівнем та відділом.
     *
     * @param employees Масив співробітників, якими керує менеджер.
     * @param name      Ім'я менеджера.
     * @param jobTitle  Посада менеджера.
     * @param level     Рівень менеджера в організації.
     * @param dept      Відділ, у якому працює менеджер.
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Конструктор класу {@code Manager}, який ініціалізує менеджера
     * з вказаними підлеглими.
     *
     * @param employees Масив співробітників, якими керує менеджер.
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Конструктор класу {@code Manager} за замовчуванням.
     * Ініціалізує менеджера з масивом підлеглих розміром 10.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Повертає рядкове представлення об'єкта {@code Manager},
     * включаючи інформацію про співробітника та список підлеглих.
     *
     * @return Рядкове представлення менеджера.
     */
    @Override
    public String toString() {
        return super.toString() + "\nEmployees: " + getEmployees();
    }

    /**
     * Повертає список підлеглих співробітників у вигляді рядка,
     * розділеного комами.
     *
     * @return Рядок, що містить імена підлеглих співробітників.
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює список підлеглих співробітників.
     *
     * @param employees Масив співробітників, якими керує менеджер.
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Повертає список підлеглих співробітників у вигляді масиву.
     *
     * @return Масив підлеглих співробітників.
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
