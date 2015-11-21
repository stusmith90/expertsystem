package com.example.system;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class SystemActivity extends Activity {
	private Button btnSubmitQuiz;
	int ans1, ans2, ans3, ans4, ans5;
	String[] resultsIf1, resultsIf2, resultsIf3, resultsIf4, resultsIf5,
			resultsIf6, resultsIf7, resultsIf8;
	Random randomGenerator;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_system);
		/*
		 * The random generator which generates the data inside each individual
		 * string randomly
		 */
		randomGenerator = new Random();
		/*
		 * The data within each string
		 */
		resultsIf1 = new String[] {
				"<b>Beetroot and Goat Cheese Pasta</b> <br><i>(560 calories) 10 - 15 minutes</i>"
						+ "<br><br><b>Ingredients:</b> <br>100 grams Spaghetti-Whole Wheat <br>1/2 Onion <br>1 Beetroot Chopped <br>Handful Spinach <br>Large Table Spoon Half Fat Creme Fraiche <br>50ml Vegtable Stock."
						+ "<br><br><b>Instructions:</b> <br>1.Boil spaghetti <br><br>2. meanwhile saute onion, stir in creme fraiche, stock and a squeeze of lemon if you have one <br><br>3. add spaghetti and stir in beetroot, spinach, and goats cheese"
						+ "<br><br><b>Left Overs:</b> <br>Make goat cheese and spinach pizza on a torilla base wrap",
				"<b>Vegetarian Sandwich</b> <i>(280 calories) 5 minutes</i>"
						+ "<br><br><b>Ingredients:</b> <br>2 slices of whole grain bread <br>Roasted red pepper hummus <br>Sunflower sprouts <br>Sliced cucumber <br>Tomato <br>Avocado."
						+ "<br><br><b>Instructions:</b> <br>spread the hummus on 1 side of the bread and then simply add the rest of the ingredients "
						+ "<br><br><b>Left Overs:</b> <br>make another sandwhich with the left overs and have it for lunch" };
		resultsIf2 = new String[] {
				"<b>Lentil and chickpea soup</b> <br>(230 calories) <i>20 minutes</i>"
						+ "<b><br><br>Ingredients:</b> <br>2tsp cummin seeds <br>pinch of chilli flakes <br>1/2 red onion chopped <br>50g red lentils <br>200 ml veg stock <br>100g can tomatoes <br>50g chickpeas."
						+ "<b><br><br>Instructions:</b> <br>1. Heat pan and fry chilli and cumin, add some oil and the onion, stir in lentils, stock and tomatoes and boil, simmer for 15 mins <br><br>2. Whizz soup in beldner or food processor, pour back into pan with chickpeas and beat through. Serve"
						+ "<b><br><br>Left Overs:</b> <br>Use extras for fridge or freezer",
				"<b>Open-Faced Vegetable Sliders</b> <br><i>(400 calories) 8 - 10 minutes</i>"
						+ "<b><br><br>Ingredients:</b> <br>Note: you can use any vegetables you have or like in this recipe, these are just examples <br><br>½ cup mushrooms, chopped <br>½ cup zucchini, chopped <br>½ cup broccoli, cut into florrets <br>1 red pepper, diced <br>6 spoon fulls of hummus <br>1 teaspoon dijon <br>mozzarella cheese <br>English muffins, cut in half"
						+ "<b><br><br>Instructions:</b> <br>1. Turn grill on, then in toaster toast your English muffin halves. <br><br>2. Put all vegetables in microwave safe bowl with a couple ounces of water, then put a plate on top to cover the bowl and microwave for 2-3 minutes. Drain water when done and the vegetables will be lightly steamed. After you’ve drained the water, add hummus and dijon and mix until all vegetables are coated.<br><br>3. On a cookie sheet arrange your English muffin halves, scoop the vegetable mixture onto the bread and cover with a slice or shredded monzzarella. A few minutes under the grill will make the cheese gooey"
						+ "<b><br><br>Left Overs:</b> <br>Use extras for next day meal" };
		resultsIf3 = new String[] {
				"<b>Mushroom tart</b> <br><i>(470 calories) 20 minutes</i>"
						+ "<b><br><br>Ingredients:</b> <br>1/2 sheet rolled puff pastry <br>125g slided mushrooms <br>1 crushed garlic clove <br>75g ricotta <br>Teaspoon nutmeg <br>Handfull of rocket."
						+ "<b><br><br>Instructions:</b> <br>1. Heat oven to 200 with a baking sheet inside<br><br>2. roll out pastry and place on the baking sheet, cook for 10 mins <br><br>3. Cook mushrooms in a pan for 3 mins then add garlic for 1 min <br><br>4. mix ricotta + nutmeg, take out pastry and spread ricotta mix over it evenly, then mushrooms and garlic and bake for 5 mins, sprinkle over rocket and serve"
						+ "<b><br><br>Left Overs:</b> <br>Lunch- ricotta on rivita with rocket",
				"meal3" };
		resultsIf4 = new String[] {
				"<b>Tuna pasta</b> <br><i>(450 calories) 8 minutes</i>"
						+ "<b><br><br>Ingredients:</b> <br>100g whole wheat pasta <br>100g chopped broccoli <br>finely chopped shallots <br>50g canned tuna in oil <br>Heaped teaspoon of capers."
						+ "<b><br><br>Instructions:</b> <br>1. Boil pasta for 6 mins <br><br>2. add broccoli after 2 mins <br><br>3. Mix shallots, capers, tuna and squeeze of lemon in a bowl<br><br>4. Drain pasta and broccoli and add to bowl for serving."
						+ "<b><br><br>Left Overs:</b> <br>Make a tuna salad", "meal4" };
		resultsIf5 = new String[] {
				"<b>Falafel Wrap</b> <br><i>(350 calories) 6 minutes</i>"
						+ "<b><br><br>Ingredients:</b> <br>1 plain flour tortilla <br>3 Falafels <br>1 pot tzatziki <br>4 baby tomatoes <br>Handfull chopped lettuce <br>Squeee of lemon."
						+ "<b><br><br>Instructions:</b> <br>1. Oven at 180, oven bake falafel<br><br>2. to serve place all ingredients on tortilla and wrap "
						+ "<b><br><br>Left Overs:</b> <br>Make a falafel + tomato salad for lunch",
				"meal5" };
		resultsIf6 = new String[] {
				"<b>Chicken Wraps</b> <br><i>(380 calories) 22-25 minutes</i>"
						+ "<b><br><br>Ingredients:</b> <br>1 plain flour tortilla <br>1 chicken breast <br>1 pot tzatziki <br>4 baby tomatoes <br>Handfull chopped lettuce <br>Squeee of lemon."
						+ "<b><br><br>Instructions:</b> <br>1. Oven at 200, oven bake chicken breast <br><br>2. warm tortilla and place all ingredients on tortilla and wrap."
						+ "<b><br><br>Left Overs:</b> <br>Make a chicken salad + tomato for lunch",
				"meal6" };
		resultsIf7 = new String[] {
				"<b>Bacon Frittata</b> <br><i>(500 calories) 25 minutes</i>"
						+ "<b><br><br>Ingredients:</b> <br>1 pepper chopped <br>1 peeled patato <br>70g smoked bacon lardons <br>1 egg <br>50g frozen peas <br>1/2 chopped onion."
						+ "<b><br><br>Instructions:</b> <br>1. Boil patato for 10 mins and slice thinly<br><br>2. fry bacon, onion, pepper, beat eggs and mix in everything, fry in a pan on a low heat for 15 mins."
						+ "<b><br><br>Left Overs:</b> <br>Use left over lardons with creme fraiche and whole wheat pasta for healthy lunch",
				"meal7" };
		resultsIf8 = new String[] {
				"</b>Falafel Wrap (350 calories)</b>" + "<br><br>Ingredients: \n1/"
						+ "<b><br><br>Instructions:</b> <br>" + "<br><br>Left Overs: \n",
				"meal8" };

		/*
		 * Holding the data for the radio buttons from the xml file
		 */
		RadioGroup gender = (RadioGroup) findViewById(R.id.question1);
		gender.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.answer1A:
					ans1 = 1;
					break;
				case R.id.answer1B:
					ans1 = 2;
					break;
				}

			}

		});
		RadioGroup nutrition = (RadioGroup) findViewById(R.id.question2);
		nutrition.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.answer2A:
					ans2 = 1;
					break;
				case R.id.answer2B:
					ans2 = 2;
					break;
				}
			}
		});
		RadioGroup goal = (RadioGroup) findViewById(R.id.question3);
		goal.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.answer3A:
					ans3 = 1;
					break;
				case R.id.answer3B:
					ans3 = 2;
					break;
				case R.id.answer3C:
					ans3 = 3;
					break;
				}
			}
		});
		RadioGroup lifestyle = (RadioGroup) findViewById(R.id.question4);
		lifestyle.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.answer4A:
					ans4 = 1;
					break;
				case R.id.answer4B:
					ans4 = 2;

					break;
				case R.id.answer4C:
					ans4 = 3;
					break;
				}
			}
		});

		RadioGroup budget = (RadioGroup) findViewById(R.id.question5);
		budget.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.answer5A:
					ans5 = 1;
					break;
				case R.id.answer5B:
					ans5 = 2;
					break;
				}
			}
		});

		/*
		 * The knowledge base which holds the rules and the method for
		 * displaying the facts
		 */

		btnSubmitQuiz = (Button) findViewById(R.id.submit);
		btnSubmitQuiz.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// result answer 1
				if (ans1 == 1 && ans2 == 1 && ans3 == 1 && ans4 == 3
						&& ans5 == 1) {

					displayResult(getRandomResult());

				}
				// result answer 2
				else if (ans2 == 1 && ans3 == 2) {

					displayResult(getRandomResult2());

				}
				// result answer 3
				else if (ans1 == 2 && ans2 == 1 && ans3 == 1 && ans4 == 3) {

					displayResult(getRandomResult3());

				}
				// result answer 4
				else if (ans2 == 2 && ans3 == 2 && ans4 == 3 && ans5 == 1) {

					displayResult(getRandomResult4());

				}

				else if (ans2 == 1 && ans3 == 1 && ans4 == 2) {

					displayResult(getRandomResult5());

				}

				else if (ans2 == 2 && ans3 == 1 && ans4 == 3 && ans5 == 2) {

					displayResult(getRandomResult6());

				}

				else if (ans2 == 2 && ans3 == 2 && ans5 == 1) {

					displayResult(getRandomResult7());

				}

				else {

					displayResult(getRandomResult8());
				}
			}

			/*
			 * displays the results once the submit button is pressed
			 */

			private void displayResult(String result) {
				Intent i = new Intent("com.example.system.SHOWRESULT");
				i.putExtra("unique_constant", result);
				startActivity(i);

			}

			/*
			 * these are the methods for calling the facts of the expert system
			 */

			public String getRandomResult() {
				return resultsIf1[randomGenerator.nextInt(resultsIf1.length)];
			}

			public String getRandomResult2() {
				return resultsIf2[randomGenerator.nextInt(resultsIf2.length)];
			}

			public String getRandomResult3() {
				return resultsIf3[randomGenerator.nextInt(resultsIf3.length)];
			}

			public String getRandomResult4() {
				return resultsIf4[randomGenerator.nextInt(resultsIf4.length)];
			}

			public String getRandomResult5() {
				return resultsIf5[randomGenerator.nextInt(resultsIf5.length)];
			}

			public String getRandomResult6() {
				return resultsIf6[randomGenerator.nextInt(resultsIf6.length)];
			}

			public String getRandomResult7() {
				return resultsIf7[randomGenerator.nextInt(resultsIf7.length)];
			}

			public String getRandomResult8() {
				return resultsIf8[randomGenerator.nextInt(resultsIf8.length)];
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.system, menu);
		return true;
	}
}