import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TasksTest {


    SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

    String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
    Epic epic = new Epic(55, subtasks);

    Meeting meeting = new Meeting(
            555,
            "Выкатка 3й версии приложения",
            "Приложение НетоБанка",
            "Во вторник после обеда"
    );

    Todos todos = new Todos();

    @BeforeEach
    public void tasksAdd() {
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);
    }


    @Test
    public void simpleTaskQueryTest() {

        boolean expected = simpleTask.matches("родителям");

        boolean actual = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void epicQueryTest() {

        boolean expected = meeting.matches("НетоБанка");

        boolean actual = true;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void meetingQueryTest() {

        boolean expected = epic.matches("Яйца");

        boolean actual = true;

        Assertions.assertEquals(expected, actual);
    }

}
