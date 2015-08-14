package ejemplo2.tse.myaplication1;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import ejemplo2.tse.myaplication1.fragments.AmigosFragment;
import ejemplo2.tse.myaplication1.fragments.DestacadosFragment;
import ejemplo2.tse.myaplication1.fragments.ProfileFragment;

public class Mymusic extends Activity implements ActionBar.TabListener{

    private Fragment [] fragments = new Fragment[]{
            new DestacadosFragment(),
            new AmigosFragment(),
            new ProfileFragment()
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymusic);

        setTabs();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        for(Fragment fragment : fragments){
            fragmentTransaction.add(R.id.main_music,fragment).hide(fragment);
        }

        fragmentTransaction.show(fragments[0]).commit();
    }

    private void setTabs(){
        // Para poder modificar el ActionBar
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        actionBar.addTab(actionBar.newTab().setText("Destacados").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("Amigos").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("Perfil").setTabListener(this));
    }


    /**
     * Called when a tab enters the selected state.
     *
     * @param tab The tab that was selected
     * @param ft  A {@link FragmentTransaction} for queuing fragment operations to execute
     *            during a tab switch. The previous tab's unselect and this tab's select will be
     *            executed in a single transaction. This FragmentTransaction does not support
     */
    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            for (Fragment fragment : fragments){
                ft.hide(fragment);
            }

        ft.show(fragments[tab.getPosition()]);
    }

    /**
     * Called when a tab exits the selected state.
     *
     * @param tab The tab that was unselected
     * @param ft  A {@link FragmentTransaction} for queuing fragment operations to execute
     *            during a tab switch. This tab's unselect and the newly selected tab's select
     *            will be executed in a single transaction. This FragmentTransaction does not
     */
    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    /**
     * Called when a tab that is already selected is chosen again by the user.
     * Some applications may use this action to return to the top level of a category.
     *
     * @param tab The tab that was reselected.
     * @param ft  A {@link FragmentTransaction} for queuing fragment operations to execute
     *            once this method returns. This FragmentTransaction does not support
     */
    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
