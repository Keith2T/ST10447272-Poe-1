/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thabo
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class TaskManagementTest {
    private Task3 taskManager;

    @Before
    public void setUp() {
        taskManager = new Task3();
        
        // Populate test data
        taskManager.addTask("Create Login", "Login feature implementation", "Mike Smith", "CR:0:SMI", 5, "To Do");
        taskManager.addTask("Create Add Features", "Add new features", "Edward Harrison", "CR:1:SON", 8, "Doing");
        taskManager.addTask("Create Reports", "Generate system reports", "Samantha Paulson", "CR:2:PAU", 2, "Done");
        taskManager.addTask("Add Arrays", "Implement array functionality", "Glenda Oberholzer", "AD:3:HOL", 11, "To Do");
    }

    @Test
    public void testDeveloperArrayPopulation() {
        String[] expectedDevelopers = {
            "Mike Smith", 
            "Edward Harrison", 
            "Samantha Paulson", 
            "Glenda Oberholzer"
        };
        
        assertArrayEquals(expectedDevelopers, taskManager.getDevelopersArray());
    }

    @Test
    public void testLongestTaskDuration() {
        String expectedLongestTask = "Glenda Oberholzer, 11";
        assertEquals(expectedLongestTask, taskManager.getLongestTaskDetails());
    }

    @Test
    public void testSearchTaskByName() {
        String expectedSearchResult = "Mike Smith, Create Login";
        assertEquals(expectedSearchResult, taskManager.searchTaskByNameForTest("Create Login"));
    }

    @Test
    public void testSearchTasksByDeveloper() {
        String[] expectedTasks = {"Create Reports"};
        assertArrayEquals(expectedTasks, taskManager.searchTasksByDeveloperForTest("Samantha Paulson"));
    }

    @Test
    public void testDeleteTask() {
        assertTrue(taskManager.deleteTaskForTest("Create Reports"));
        assertNull(taskManager.searchTaskByNameForTest("Create Reports"));
    }
}