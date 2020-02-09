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
        testJobOne = new Job("Barista", new Employer("Broadway Coffee"), new Location("Westport"), new PositionType("Front of house"), new CoreCompetency("Friendliness"));
        testJobTwo = new Job("Loan Processor", new Employer("nbkc Bank"), new Location("Waldo"), new PositionType("Financial sector"), new CoreCompetency("Detail Oriented"));
    }

    @Test
    public void testSettingJobId() {
        Assert.assertEquals(testJobOne.getId(), testJobTwo.getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Assert.assertEquals("Barista", testJobOne.getName());
        Assert.assertEquals("Broadway Coffee", testJobOne.getEmployer().getValue());
        Assert.assertEquals("Westport", testJobOne.getLocation().getValue());
        Assert.assertEquals("Front of house", testJobOne.getPositionType().getValue());
        Assert.assertEquals("Friendliness", testJobOne.getCoreCompetency().getValue());
    }


    @Test
    public void testJobsForEquality() {
        Assert.assertFalse(testJobOne.getId() == testJobTwo.getId());
    }

    @Test
    public void testForBlanks () {
        Job codingJobThree = new Job("Back End Engineer", new Employer("nbkc Bank"), new Location("Kansas City"), new PositionType("Java Developer"), new CoreCompetency("Analytical thinking"));
        Assert.assertTrue(testJobOne.toString().startsWith("\n") == testJobTwo.toString().endsWith("\n"));
    }

    @Test
    public void testForLabels () {
        Job testJob =  new Job("Customer Service Rep", new Employer("Ad Astra"), new Location("Waldo"), new PositionType("Customer Service"), new CoreCompetency("friendliness"));
        String labels = "\nID: " + testJob.getId() + " \nName: " + testJob.getName() + " \nEmployer: " + testJob.getEmployer() + " \nLocation: " + testJob.getLocation() + " \nPosition Type: " + testJob.getPositionType() + " \nCore Competency: " + testJob.getCoreCompetency() + "\n";
        Assert.assertEquals(testJob.toString(), labels);
    }

    @Test
    public void testForEmptyField () {
        Job testJob =  new Job("Vacuum Cleaner Salesman", new Employer(null), new Location("Philadelphia"), new PositionType("Sales"), new CoreCompetency("Customer Service"));
        String labels = "\nID: " + testJob.getId()+ "\nName: " + testJob.getName() + "\nEmployer: " + testJob.getEmployer() + "\nLocation: " + testJob.getLocation() + "\nPosition Type: " + testJob.getPositionType() + "\nCore Competency: " + testJob.getCoreCompetency() + "\n";
        Assert.assertFalse(testJob.toString().equals(labels));
    }

}
