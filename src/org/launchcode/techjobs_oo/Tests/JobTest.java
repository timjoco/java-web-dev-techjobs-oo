package org.launchcode.techjobs_oo.Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;

public class JobTest {
    Job testJobOne;
    Job testJobTwo;


    @Before
    public void createJobObject () {
        testJobOne = new Job();
        testJobTwo = new Job();
    }

    @Test
    public void testSettingJobId () {

        Assert.assertFalse(testJobOne.getId() == testJobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields () {
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertEquals("Product tester", newJob.getName());
        Assert.assertEquals("ACME", newJob.getEmployer().getValue());
        Assert.assertEquals("Desert", newJob.getLocation().getValue());
        Assert.assertEquals("Quality control", newJob.getPositionType().getValue());
        Assert.assertEquals("Persistence", newJob.getCoreCompetency().getValue());
    }


    @Test
    public void testJobsForEquality () {
        Job codingJobOne = new Job ("Front End Engineer", new Employer("VML"), new Location("Kansas City"), new PositionType("UX"), new CoreCompetency("Creativity"));
        Job codingJobTwo = new Job ("Front End Engineer", new Employer("VML"), new Location("Kansas City"), new PositionType("UX"), new CoreCompetency("Creativity"));
        Assert.assertFalse(codingJobOne.getId() == codingJobTwo.getId());
    }

}
