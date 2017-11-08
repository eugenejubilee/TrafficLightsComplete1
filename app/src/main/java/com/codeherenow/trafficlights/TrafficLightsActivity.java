/*
 * Copyright (C) 2013 Code Here Now - A subsidiary of Mobs & Geeks
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file 
 * except in compliance with the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the 
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package com.codeherenow.trafficlights;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

// This class extends 'Activity' and implements a 'View.OnClickListener'.
// Hence, it is of type 'Activity' and 'View.OnClickListener'. 
public class TrafficLightsActivity extends Activity implements OnClickListener {

	// UI reference variables
	// private ImageView redLight;
	// private ImageView yellowLight;
	// private ImageView greenLight;
	private ImageView permit;
	private ImageView regs;
	private ImageView parent;
    private ImageView curriculum;
    private ImageView subjects;



	// This is the method that is called by the Android framework when your Activity is being initiated.
	// Ideal for:
	//     1. Setting a content view to your Activity.
	//     2. Getting references to the views defined in your layout.
	//     3. Adding event listeners to your views.
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// This should always be the first call, consider this a formality now.
		super.onCreate(savedInstanceState);

		// Sets a layout for the Activity using the layout resource identifier
		setContentView(R.layout.traffic_lights);

		// Obtain a reference to the view with the given id. The id must be defined in the layout
		// referenced by 'R.layout.traffic_lights'
		// redLight = (ImageView) findViewById(R.id.red_light);
		// yellowLight = (ImageView) findViewById(R.id.yellow_light);
		// greenLight = (ImageView) findViewById(R.id.green_light);
		permit = (ImageView) findViewById(R.id.permit);
		regs = (ImageView) findViewById(R.id.regs);
		parent = (ImageView) findViewById(R.id.parent);
        curriculum = (ImageView) findViewById(R.id.curriculum);
        subjects = (ImageView) findViewById(R.id.subjects);


		// Assign click listeners to buttons


		// redLight.setOnClickListener(this);
		// greenLight.setOnClickListener(this);
		// yellowLight.setOnClickListener(this);
		permit.setOnClickListener(this);
		regs.setOnClickListener(this);
		parent.setOnClickListener(this);
        curriculum.setOnClickListener(this);
        subjects.setOnClickListener(this);

	}

	// This method is defined in the 'View.OnClickListener' interface
	@Override
	public void onClick(View v) {

		turnLightsOff();

		// if (v == redLight) {
		//	turnOnRedLight ();
		// }

		// else if (v == yellowLight) {
		//	turnOnYellowLight ();
		//}

		// else if (v == greenLight) {
		//	turnOnGreenLight();

		// }

		// else

		    if (v == permit) {
				turnOnPermit ();
		}

		else if (v == regs) {
			turnOnRegs ();
		}

		else if (v == parent) {
			turnOnParent ();
		}

            else if (v == curriculum) {
                turnOnCurriculum ();
            }

            else if (v == subjects) {
                turnOnSubjects ();
            }
	}

	private void turnLightsOff() {
	//	redLight.setImageResource(R.drawable.light_off);
	//	yellowLight.setImageResource(R.drawable.where);
	//	greenLight.setImageResource(R.drawable.soc);
		permit.setImageResource(R.drawable.permit);
		regs.setImageResource(R.drawable.regs);
		parent.setImageResource(R.drawable.parent);
        curriculum.setImageResource(R.drawable.curriculum);
        subjects.setImageResource(R.drawable.subjects);
	}
	
	// private void turnOnRedLight() {
	//	redLight.setImageResource(R.drawable.red_on);
	// }

	// private void turnOnYellowLight() {
	//	yellowLight.setImageResource(R.drawable.yellow_on);
	// }

	// private void turnOnGreenLight() {greenLight.setImageResource(R.drawable.green_on); }

	private void turnOnPermit() {
		permit.setImageResource(R.drawable.permit__ans);
	}

	private void turnOnRegs() { regs.setImageResource(R.drawable.regs__ans); }

	private void turnOnParent() { parent.setImageResource(R.drawable.parent__ans); }

    private void turnOnCurriculum() { curriculum.setImageResource(R.drawable.curriculum__ans); }

    private void turnOnSubjects() { subjects.setImageResource(R.drawable.subjects__ans); }

	}






