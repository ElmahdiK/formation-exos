package com.formation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

public class StaffTest {


    private List<IWorker> workers;
    private Staff staff;

    @Before
    public void setUp() throws Exception {
        staff = new Staff();
        workers = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            IWorker mock = Mockito.mock(IWorker.class);
            Mockito.when(mock.calculerSalaire()).thenReturn((i+1)*1000.0);
            workers.add(mock);
        }
    }

    
    @Test
    public void testGetAverageSalary0Worker() {
        Assert.assertEquals(0.0, staff.getAverageSalary(), 0);
    }
    
    /*
    @Test(expected= Exception.class)
    public void testGetAverageSalary0Worker() throws Exception {
    	staff.getAverageSalary();
    }

    @Test
    public void testGetAverageSalary0WorkerMoche() throws Exception {
    	try {
    		staff.getAverageSalary();
    		fail();
    	} catch(Exception e) {
			
		}
    }
    */
    
    @Test
    public void testGetAverageSalary1Worker() {
        staff.add(workers.get(0));
        Assert.assertEquals(1000.0, staff.getAverageSalary(), 0);
    }

    @Test
    public void testGetAverageSalaryNWorker() {
        for(IWorker worker : workers) {
            staff.add(worker);
        }
        Assert.assertEquals(5500.0, staff.getAverageSalary(), 0);
    }
}
