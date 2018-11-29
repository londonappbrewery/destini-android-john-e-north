package com.londonappbrewery.destini;

public class StoryLine {
        private int mStoryTextID;
        private int mTopBtnChoiceID;
        private int mBottomBtnChoiceID;
        private int mTopBtnNextIDX;
        private int mBottomNxtIDX;

        public StoryLine(int storyTextID, int topBtnChoiceID, int bottomBtnChoiceID, int topBtnNextIDX, int bottomBtnNextIDX){
            mStoryTextID = storyTextID;
            mTopBtnChoiceID = topBtnChoiceID;
            mBottomBtnChoiceID = bottomBtnChoiceID;
            mTopBtnNextIDX = topBtnNextIDX;
            mBottomNxtIDX = bottomBtnNextIDX;
        }

        public int getStoryTextID() {
            return mStoryTextID;
        }

        public void setStoryTextID(int storyTextID) {
            mStoryTextID = storyTextID;
        }

        public int getTopBtnChoiceID() {
            return mTopBtnChoiceID;
        }

        public void setTopBtnChoiceID(int topBtnChoiceID) {
            mTopBtnChoiceID = topBtnChoiceID;
        }

        public int getBottomBtnChoiceID() {
            return mBottomBtnChoiceID;
        }

        public void setBottomBtnChoiceID(int bottomBtnChoiceID) {
            mBottomBtnChoiceID = bottomBtnChoiceID;
        }

        public int getTopBtnNextIDX() {
            return mTopBtnNextIDX;
        }

        public void setTopBtnNextIDX(int topBtnNextIDX) {
            mTopBtnNextIDX = topBtnNextIDX;
        }

        public int getBottomNxtIDX() {
            return mBottomNxtIDX;
        }

        public void setBottomNxtIDX(int bottomNxtIDX) {
            mBottomNxtIDX = bottomNxtIDX;
        }
    }
