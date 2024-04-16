package sit707_tasks;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s223148345";
		Assert.assertNotNull("Student ID is s223148345", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Bharat Bhatt";
		Assert.assertNotNull("Student name is Bharat Bhatt", studentName);
	}
	
	//TEST CASES FOR ALL THE MONTHS FOR 2024//

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		DateUtil date = new DateUtil(31, 1, 2024);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		DateUtil date = new DateUtil(31, 1, 2024);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + (int)(Math.random() * ((31 - 1) + 1));
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        date.increment();
        System.out.println(date);
	}
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		DateUtil date = new DateUtil(1, 1, 2024);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		DateUtil date = new DateUtil(1, 1, 2024);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
	}
	
	@Test
	public void testMaxFebruary29InLeapYearShouldIncrementToMarch1() {
		DateUtil date = new DateUtil(29, 2, 2024);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
	}
	
	@Test
	public void testMaxFebruary29InLeapYearShouldDecrementToFebruary28() {
		DateUtil date = new DateUtil(29, 2, 2024);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
	}
	
	@Test
	public void testMaxMarch31ShouldIncrementToApril1() {
		DateUtil date = new DateUtil(31, 3, 2024);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(4, date.getMonth());
	}
	
	@Test
	public void testMaxMarch31ShouldDecrementToMarch30() {
		DateUtil date = new DateUtil(31, 3, 2024);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(3, date.getMonth());
	}
	
	@Test
	public void testMaxApril30ShouldIncrementToMay1() {
		DateUtil date = new DateUtil(30, 4, 2024);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(5, date.getMonth());
	}
	
	@Test
	public void testMaxApril30ShouldDecrementToApril29() {
		DateUtil date = new DateUtil(30, 4, 2024);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(4, date.getMonth());
	}
	
	@Test
	public void testMaxMay31ShouldIncrementToJune1() {
		DateUtil date = new DateUtil(31, 5, 2024);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(6, date.getMonth());
	}
	
	@Test
	public void testMaxMay31ShouldDecrementToMay30() {
		DateUtil date = new DateUtil(31, 5, 2024);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(5, date.getMonth());
	}
	
	@Test
	public void testMaxJune30ShouldIncrementToJuly1() {
		DateUtil date = new DateUtil(30, 6, 2024);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(7, date.getMonth());
	}
	
	@Test
	public void testMaxJune30ShouldDecrementToJune29() {
		DateUtil date = new DateUtil(30, 6, 2024);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(6, date.getMonth());
	}
	
	@Test
	public void testMaxJuly31ShouldIncrementToAugust1() {
		DateUtil date = new DateUtil(31, 7, 2024);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(8, date.getMonth());
	}
	
	@Test
	public void testMaxJuly31ShouldDecrementToJuly30() {
		DateUtil date = new DateUtil(31, 7, 2024);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(7, date.getMonth());
	}
	
	@Test
	public void testMaxAugust31ShouldIncrementToSeptember1() {
		DateUtil date = new DateUtil(31, 8, 2024);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(9, date.getMonth());
	}
	
	@Test
	public void testMaxAugust31ShouldDecrementToAugust30() {
		DateUtil date = new DateUtil(31, 8, 2024);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(8, date.getMonth());
	}
	
	@Test
	public void testMaxSeptember30ShouldIncrementToOctober1() {
		DateUtil date = new DateUtil(30, 9, 2024);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(10, date.getMonth());
	}
	
	@Test
	public void testMaxSeptember30ShouldDecrementToSeptember29() {
		DateUtil date = new DateUtil(30, 9, 2024);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(9, date.getMonth());
	}
	
	@Test
	public void testMaxOctober31ShouldIncrementToNovember1() {
		DateUtil date = new DateUtil(31, 10, 2024);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(11, date.getMonth());
	}
	
	@Test
	public void testMaxOctober31ShouldDecrementToOctober30() {
		DateUtil date = new DateUtil(31, 10, 2024);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(10, date.getMonth());
	}
	
	@Test
	public void testMaxNovember30ShouldIncrementToDecember1() {
		DateUtil date = new DateUtil(30, 11, 2024);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(12, date.getMonth());
	}
	
	@Test
	public void testMaxNovember30ShouldDecrementToNovember29() {
		DateUtil date = new DateUtil(30, 11, 2024);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(11, date.getMonth());
	}
	
	@Test
	public void testMaxDecember31ShouldIncrementToJanuary1NextYear() {
		DateUtil date = new DateUtil(31, 12, 2024);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2025, date.getYear());
	}
	
	@Test
	public void testMaxDecember31ShouldDecrementToDecember30() {
		DateUtil date = new DateUtil(31, 12, 2024);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(12, date.getMonth());
	}
	
	// LEAP YEAR TEST CASES//
	
	@Test
	public void testLeapYearFebruary29ShouldIncrementToMarch1() {
	    DateUtil date = new DateUtil(29, 2, 2024);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	}

	@Test
	public void testLeapYearFebruary29ShouldDecrementToFebruary28() {
	    DateUtil date = new DateUtil(29, 2, 2024);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(28, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}
	
	// ORANGE TABLE TEST CASES//
	
	@Test
	public void testonejuneincreementedtosecondjune1994() {
	    DateUtil date = new DateUtil(1, 6, 1994);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
	@Test
	public void testsecondjuneincreementedtothirdjune1994() {
	    DateUtil date = new DateUtil(2, 6, 1994);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
	@Test
	public void testfifteenjuneincreementedtosixteenjune1994() {
	    DateUtil date = new DateUtil(15, 6, 1994);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
	@Test
	public void testthirtyjuneincreementedtofirstjuly1994() {
	    DateUtil date = new DateUtil(30, 6, 1994);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	}
	@Test
	public void testthirtyfirstjunetoinvaliddate() {
	    try {
	        DateUtil date = new DateUtil(31, 6, 1994);
	        date.increment();
	        System.out.println(date);
	        Assert.assertEquals(1, date.getDay());
	        Assert.assertEquals(7, date.getMonth());
	    } catch (RuntimeException e) {
	        System.out.println("Invalid_Date");
	    }
	}

	@Test
	public void testfifteenjanincreementedtosixteenjan1994() {
	    DateUtil date = new DateUtil(15, 1, 1994);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	}
	@Test
	public void testfifteenfebtosixteenfeb1994() {
	    DateUtil date = new DateUtil(15, 2, 1994);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}
	@Test
	public void testfifteennovincreementedtosixteennov1994() {
	    DateUtil date = new DateUtil(15, 11, 1994);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	}
	@Test
	public void testfifteendecincreementedtosixteendec1994() {
	    DateUtil date = new DateUtil(15, 12, 1994);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	}
	@Test
	public void testfifteenjuneincreementedtosixteenjune1700() {
	    DateUtil date = new DateUtil(15, 6, 1700);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
	@Test
	public void testfifteenjuneincreementedtosixteenjune1701() {
	    DateUtil date = new DateUtil(15, 6, 1701);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
	@Test
	public void testfifteenjuneincreementedtosixteenjune2023() {
	    DateUtil date = new DateUtil(15, 6, 2023);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
	@Test
	public void testfifteenjuneincreementedtosixteenjune2024() {
	    DateUtil date = new DateUtil(15, 6, 2024);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}
    }


