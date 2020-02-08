package org.launchcode.techjobs_oo.Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class JobTest {
    Job testJobOne;
    Job testJobTwo;


    @Before
    public void createJobObject() {
        testJobOne = new Job();
        testJobTwo = new Job();
    }

    @Test
    public void testSettingJobId() {

        Assert.assertFalse(testJobOne.getId() == testJobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertEquals("Product tester", newJob.getName());
        Assert.assertEquals("ACME", newJob.getEmployer().getValue());
        Assert.assertEquals("Desert", newJob.getLocation().getValue());
        Assert.assertEquals("Quality control", newJob.getPositionType().getValue());
        Assert.assertEquals("Persistence", newJob.getCoreCompetency().getValue());
    }


    @Test
    public void testJobsForEquality() {
        Job codingJobOne = new Job("Front End Engineer", new Employer("VML"), new Location("Kansas City"), new PositionType("UX"), new CoreCompetency("Creativity"));
        Job codingJobTwo = new Job("Front End Engineer", new Employer("VML"), new Location("Kansas City"), new PositionType("UX"), new CoreCompetency("Creativity"));
        Assert.assertFalse(codingJobOne.getId() == codingJobTwo.getId());
    }

    @Test
    public void testForBlanks () {
        Job codingJobThree = new Job("Back End Engineer", new Employer("nbkc Bank"), new Location("Kansas City"), new PositionType("Java Developer"), new CoreCompetency("Analytical thinking"));
        Assert.assertTrue(codingJobThree.toString().startsWith("\n") == codingJobThree.toString().endsWith("\n"));
    }

    @Test
    public void testForLabels () {
        Job testJob =  new Job("Customer Service Rep", new Employer("Ad Astra"), new Location("Waldo"), new PositionType("Customer Service"), new CoreCompetency("friendliness"));
        String labels = "\nID: " + testJob.getId() + " \nName: " + testJob.getName() + " \nEmployer: " + testJob.getEmployer() + " \nLocation: " + testJob.getLocation() + " \nPosition Type: " + testJob.getPositionType() + " \nCore Competency: " + testJob.getCoreCompetency() + "\n";
        Assert.assertEquals(testJob.toString(), labels);
    }

    @Test
    public void testForEmptyField () {
        Job testJob =  new Job("Vacuum Cleaner Salesman", new Employer("Hoover"), new Location("Philadelphia"), new PositionType("Sales"), new CoreCompetency("Customer Service"));
        String labels = "\nID: " + " " + " \nName: " + " " + " \nEmployer: " + " " + " \nLocation: " + " " + " \nPosition Type: " + " " + " \nCore Competency: " + " " + "\n";
        Assert.assertFalse(testJob.toString().equals(labels));
    }

}
