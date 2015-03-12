package it.carlom.stikkyheader.core.animator;


import com.lexue.courser.view.widget.stikkyheader.HeaderAnimator;
import com.nineoldandroids.view.ViewHelper;

public class BaseStickyHeaderAnimator extends HeaderAnimator {

    private float mTransactionRatio;

    @Override
    protected void onAnimatorAttached() {
        //nothing to do
    }

    @Override
    protected void onAnimatorReady() {
        //nothing to do
    }

    @Override
    public void onScroll(int scrolledY) {

        ViewHelper.setTranslationY(getHeader(),Math.max(scrolledY, getMaxTransaction()));

        mTransactionRatio = calculateTransactionRatio(scrolledY);
    }

    public float getTranslationRatio() {
        return mTransactionRatio;
    }

    private float calculateTransactionRatio(int scrolledY) {
        return (float) scrolledY / (float) getMaxTransaction();
    }

}
