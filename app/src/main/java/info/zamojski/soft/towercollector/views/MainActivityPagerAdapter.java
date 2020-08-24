/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package info.zamojski.soft.towercollector.views;

import info.zamojski.soft.towercollector.R;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.jetbrains.annotations.NotNull;

public class MainActivityPagerAdapter extends FragmentPagerAdapter {

    private static final int MainLastFragmentIndex = 0;
    private static final int MainStatsFragmentIndex = 1;

    private Context context;

    public MainActivityPagerAdapter(FragmentManager fm, Context context) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.context = context;
    }

    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case MainLastFragmentIndex:
                return new MainLastFragment();
            case MainStatsFragmentIndex:
                return new MainStatsFragment();
            default:
                throw new UnsupportedOperationException("Cannot find view at position " + position);
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case MainLastFragmentIndex:
                return context.getString(R.string.main_tab_last_title);
            case MainStatsFragmentIndex:
                return context.getString(R.string.main_tab_stats_title);
            default:
                throw new UnsupportedOperationException("Cannot find view title at position " + position);
        }
    }
}
