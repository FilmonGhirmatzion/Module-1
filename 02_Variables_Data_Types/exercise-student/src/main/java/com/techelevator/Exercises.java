package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;
		System.out.println(birdsRemaining);

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println(numberOfExtraBirds);

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRaccoonsPlayingInTheWood=3;
		int numberOfRaccoonsGoHomeToEatDinner =2;
		int numberOfRaccoonsLeftInTheWood= numberOfRaccoonsPlayingInTheWood - numberOfRaccoonsGoHomeToEatDinner;
		System.out.println(numberOfRaccoonsLeftInTheWood);


        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers =5;
		int numberOfBees = 3;
		int lessBeesThanFlowers = numberOfFlowers - numberOfBees;
		System.out.println(lessBeesThanFlowers);



        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyPigeonEatingBreadcrumbs = 1;
		int anotherPigeonCameToEatBreadcrumbs = 1;
		int totalPigeonEatingBreadcrumbs = lonelyPigeonEatingBreadcrumbs + anotherPigeonCameToEatBreadcrumbs;
		System.out.println(totalPigeonEatingBreadcrumbs);


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlSittingOnTheFence =3;
		int owlsJoined =2;
		int totalOwlsOnTheFence = owlSittingOnTheFence + owlsJoined;
		System.out.println(totalOwlsOnTheFence);



        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorkingOnTheirHome =2;
		int beaversWentForASwim = 1;
		int totalBeaversWorkingOnTheirHome = beaversWorkingOnTheirHome -beaversWentForASwim;
		System.out.println(totalBeaversWorkingOnTheirHome);



        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSittingOnTree= 2;
		int toucansJoinsThem = 1;
		int totalToucans = toucansSittingOnTree + toucansJoinsThem;
		System.out.println(totalToucans);



        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsInTree = 4;
		int nutsInTheTree = 2;
		int squirrelsThanNuts = squirrelsInTree -nutsInTheTree;
		System.out.println(squirrelsThanNuts);


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quarter = 0.25;
		double dime = 0.10;
		double nickels = (0.05 *2 );
		double moneyFound = quarter + dime + nickels;
		System.out.println(moneyFound);


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		  int brierClassBakesMuffins = 18;
		  int macadamsClassBakesMuffins = 20;
		  int flanneryClassbakesMuffins = 17;
		  int totalBakingMuffinsFirstGrade = brierClassBakesMuffins + macadamsClassBakesMuffins + flanneryClassbakesMuffins;
		System.out.println(totalBakingMuffinsFirstGrade);


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double hiltBoughtYoyo = 0.24;
		double hiltBoughtwhistle = 0.14;
		double totalHiltSpend = hiltBoughtYoyo + hiltBoughtYoyo;
		System.out.println(totalOwlsOnTheFence);


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int hiltMadeRiceKrispieTreats = 5;
		int hiltUsedLargeMarshmallows = 8;
		int hiltUsedMiniMarshmallows = 10;
		int totalMarshmallowsHiltUses = hiltUsedLargeMarshmallows + hiltUsedMiniMarshmallows;
		System.out.println(totalMarshmallowsHiltUses);



        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hiltHouseInchesOfSnow = 29;
		int brecknockElementarySchoolInchesOfSnow= 17;
		int moreSnowInHiltHouse= hiltHouseInchesOfSnow - brecknockElementarySchoolInchesOfSnow;
		System.out.println(moreSnowInHiltHouse +" inches ");


        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int hiltHasTotalMoney = 10;
		int hiltSpendOnAToy= 3;
		int hiltSpendOnAPencil= 2;
		int totalMoneySheHaveLeft= hiltHasTotalMoney - hiltSpendOnAToy -hiltSpendOnAPencil;
		System.out.println("$"+totalMoneySheHaveLeft);



        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int joshMarbles = 16;
		int joshLostMarbles= 7;
		int totalMarblesNow = joshMarbles - joshLostMarbles;
		System.out.println(totalMarblesNow);



        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int meganSeashells = 19;
		int totalNeededSeashellsToHave25 =25 - meganSeashells;
		System.out.println(totalNeededSeashellsToHave25);


        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int bradTotalBallons= 17;
		int redBalloons = 8;
		int greenBalloons = bradTotalBallons -redBalloons;
		System.out.println(greenBalloons+ " green balloons");


        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnTheShelf= 38;
		int martaPutBooksOnTheShelf= 10;
		int totalBooksOnTheShelf= booksOnTheShelf + martaPutBooksOnTheShelf;
		System.out.println(totalBooksOnTheShelf);


        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int sum = 6*8;
		System.out.println(sum);


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
         double twoIceCreamCost = 0.99 * 2;
		System.out.println(twoIceCreamCost);

        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int hiltHasRocks = 64;
		int hiltTotalRocksNeedsToComplete = 125;
		int totalMoreRocksNeed= hiltTotalRocksNeedsToComplete - hiltHasRocks;
		System.out.println(totalMoreRocksNeed);


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltMarbles = 38;
		int hiltLost = 15;
		int totalMarblesLeft= hiltMarbles - hiltLost;
		System.out.println(totalMarblesLeft);


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int hiltAndSisterToDrove = 78;
		int hiltAndSisterDrove= 32;
		int totalMileLeft= hiltAndSisterToDrove - hiltAndSisterDrove;
		System.out.println(totalMileLeft);


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
          int spentShovelingSnowOnSaturday= 90;
          int shovelingSnowSaturdayAfternoon=45;
          int totalShovelingTime= spentShovelingSnowOnSaturday + shovelingSnowSaturdayAfternoon;
		System.out.println(totalShovelingTime+ " minutes");

        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double boughtHotDog= 6;
		double eachHotDogCost = 0.50;
		double totalMoneypayForAll= boughtHotDog * 0.50;
		System.out.println(totalMoneypayForAll);


        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double hiltHascent= 0.50;
		double costOfPencil= 0.07;
		double pencilsSheCanBuy= hiltHascent - costOfPencil;
		System.out.println(pencilsSheCanBuy);



        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int sawButterFlies = 33;
		int orangeButterFlies= 20;
		int redButterFlies= sawButterFlies - orangeButterFlies;
		System.out.println(redBalloons);


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double kateGaveClerk= 1.0;
		double candyCost = 0.54;
		double changeKateGetBack = kateGaveClerk-candyCost;
		System.out.println(changeKateGetBack);


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int markHasTree =13;
		int plantsMore =12;
		int totalTree= markHasTree + plantsMore;
		System.out.println(totalTree);


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		 int JoyWillSeeHerGrandma= 24;
		System.out.println(joshLostMarbles);


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int kimHasCousins =4;
		int kimWantGiveEachOne= 5;
		int howMuchGumWillSheneed= kimHasCousins * kimWantGiveEachOne;
		System.out.println(howMuchGumWillSheneed);


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double danHas = 3.00;
		double broughtCandyBarFor= 1.00;
		double moneyLeft= danHas -broughtCandyBarFor;
		System.out.println(moneyLeft);



        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsInTheLake = 5;
		int eachBoatHas= 3;
		int peopleOnBoatsInLake= boatsInTheLake * eachBoatHas;



        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellenHasLegos= 380;
		int ellenLost= 57;
		int totalLegos= ellenHasLegos- ellenLost;



        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int arthurBakedMuffins= 35;
		int arthurToBake= 83;
		int moreMuffinsToBake= arthurToBake- arthurBakedMuffins;




        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyHasCrayons= 1400;
		int lucyHasCrayons= 290;
		int willyHasMoreCrayonsThanLucy= willyHasCrayons-lucyHasCrayons;



        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersOnPage=10;
		int pagesOfStickers= 22;
		int stickersWeHave= stickersOnPage * pagesOfStickers;



        /* Exercise 39
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int cupcakes =96;
		int childrenToShare= 8;
		int eachPersonGet= cupcakes / childrenToShare;


        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int madeGingerbreadCookies=47;
		int eachJarContains= 6;
		int remainingCookies =(madeGingerbreadCookies /eachJarContains) ;



        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int preparedCroissants= 59;
		int neighbors = 8;
		int croissants= preparedCroissants-neighbors;




        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */



        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int marianMadePretzels= 480;
		int oneServingIsEqualTo= 12;
		int totalServing= marianMadePretzels/oneServingIsEqualTo;



        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int bakedLemonCupcake =53;
		int lemonsCapcakesLeftAtHome= 2;



        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		double susieMomPreparedCarrot= 74;
		double carrotsServedEqually= 12;
		double CarrotsLeftUneaten=  susieMomPreparedCarrot %12;



        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		double susieAndSisterGathers= 98;
		double everyShelfCanCarry=7;
		double shelvesReminder= susieAndSisterGathers % everyShelfCanCarry;
		System.out.println(shelvesReminder);




        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int albumContains= 20;
		int numberOfPictures= 480;
		int albumSheNeed= numberOfPictures /albumContains;



        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		double joeCollected= 94;
		double fullBoxCanHold= 8;
		double boxesFilled= joeCollected / fullBoxCanHold;


        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int susieFatherHasBooksToDIstribute= 210;
		int shelves=10;
		int shelvesContain= 210 /10;
		System.out.println(shelvesContain);


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
                */
		int cristinaBakedCroissants= 17;
		int toServeToSevenGuests= 7;
		int eachGuestsHave= cristinaBakedCroissants / toServeToSevenGuests;
		System.out.println(eachGuestsHave);



	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */


	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		int distanceFromNewYorkTOChicagoInMiles= 800;
		int distanceTrainHasAlreadyTraveledInMiles= 537;
		int percentageOfTripCompletedInWholeNumber = (distanceFromNewYorkTOChicagoInMiles *100/ distanceFromNewYorkTOChicagoInMiles);
		System.out.println(percentageOfTripCompletedInWholeNumber);


	}

}
