package com.londonappbrewery.destini;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mTextView;
    Button ansr1Button;
    Button ansr2Button;
    int mTextID;
    int mAnsr1ID;
    int mAnsr2ID;
    int mIndex = 0;
    int nxtIndex;

    private StoryLine[] mStoryTree = new StoryLine[] {
            new StoryLine(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2,2,1),
            new StoryLine(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2,2,3),
            new StoryLine(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2,5,4),
            new StoryLine(R.string.T4_End,R.string.T7_StartOver,R.string.T8_Finish,0,-1),
            new StoryLine(R.string.T5_End,R.string.T7_StartOver,R.string.T8_Finish,0,-1),
            new StoryLine(R.string.T6_End,R.string.T7_StartOver,R.string.T8_Finish,0,-1)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null){
            mIndex = savedInstanceState.getInt("IndexKey");
            nxtIndex = savedInstanceState.getInt("NextIndexKey");
        } else {
            mIndex = 0;
        }


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = (TextView) findViewById(R.id.storyTextView);
        ansr1Button = (Button) findViewById(R.id.buttonTop);
        ansr2Button = (Button) findViewById(R.id.buttonBottom);
        updateStory();

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        ansr1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nxtIndex = mStoryTree[mIndex].getTopBtnNextIDX();
                updateStory();
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        ansr2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nxtIndex = mStoryTree[mIndex].getBottomNxtIDX();
                updateStory();
            }
        });

    }

    private void updateStory() {
        if (nxtIndex >= 0){
            mIndex = nxtIndex;
        }else {
            finish();
        }
        mTextID = mStoryTree[mIndex].getStoryTextID();
        mTextView.setText(mTextID);
        mAnsr1ID = mStoryTree[mIndex].getTopBtnChoiceID();
        ansr1Button.setText(mAnsr1ID);
        mAnsr2ID = mStoryTree[mIndex].getBottomBtnChoiceID();
        ansr2Button.setText(mAnsr2ID);
        }

    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("IndexKey",mIndex);
        outState.putInt("NextIndexKey",nxtIndex);
    }

}
