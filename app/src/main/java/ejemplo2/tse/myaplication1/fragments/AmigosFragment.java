package ejemplo2.tse.myaplication1.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ejemplo2.tse.myaplication1.R;
import ejemplo2.tse.myaplication1.adapters.AmigosAdapter;
import ejemplo2.tse.myaplication1.models.Amigo;

/**
 * A simple {@link Fragment} subclass.
 */
public class AmigosFragment extends Fragment {


    public AmigosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_amigos, container, false);
    }

    /**
     * Called when the fragment's activity has been created and this
     * fragment's view hierarchy instantiated.  It can be used to do final
     * initialization once these pieces are in place, such as retrieving
     * views or restoring state.  It is also useful for fragments that use
     * {@link #setRetainInstance(boolean)} to retain their instance,
     * as this callback tells the fragment when it is fully associated with
     * the new activity instance.  This is called after {@link #onCreateView}
     * and before {@link #onViewStateRestored(Bundle)}.
     *
     * @param savedInstanceState If the fragment is being re-created from
     *                           a previous saved state, this is the state.
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayList<Amigo> amigoArrayList = new ArrayList<Amigo>();
        Amigo amigo = new Amigo();
        amigo.setNombre("Jairo Cruz");
        amigo.setTwitter("@jaironmainden");
        amigo.setUltimaCancion("Invisible U2");

        Amigo amigo2 = new Amigo();
        amigo2.setNombre("Jairo Cruz");
        amigo2.setTwitter("@jaironmainden");
        amigo2.setUltimaCancion("Invisible U2");

        Amigo amigo3 = new Amigo();
        amigo3.setNombre("Jairo Cruz");
        amigo3.setTwitter("@jaironmainden");
        amigo3.setUltimaCancion("Invisible U2");

        Amigo amigo4 = new Amigo();
        amigo4.setNombre("Jairo Cruz");
        amigo4.setTwitter("@jaironmainden");
        amigo4.setUltimaCancion("Invisible U2");

        Amigo amigo5 = new Amigo();
        amigo5.setNombre("Jairo Cruz");
        amigo5.setTwitter("@jaironmainden");
        amigo5.setUltimaCancion("Invisible U2");

        Amigo amigo6 = new Amigo();
        amigo6.setNombre("Jairo Cruz");
        amigo6.setTwitter("@jaironmainden");
        amigo6.setUltimaCancion("Invisible U2");

        amigoArrayList.add(amigo);
        amigoArrayList.add(amigo2);
        amigoArrayList.add(amigo3);
        amigoArrayList.add(amigo4);
        amigoArrayList.add(amigo5);
        amigoArrayList.add(amigo6);

        RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new AmigosAdapter(amigoArrayList, R.layout.row_amigos));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
