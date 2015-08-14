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
import ejemplo2.tse.myaplication1.adapters.SongsAdapter;
import ejemplo2.tse.myaplication1.models.Song;

/**
 * A simple {@link Fragment} subclass.
 */
public class DestacadosFragment extends Fragment {


    public DestacadosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_destacados, container, false);
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

        ArrayList<Song> songs = new ArrayList<Song>();
        Song song = new Song();
        song.setStars(3);
        song.setSongName("Get Lucky");
        song.setSongArtist("Daft Punk");
        songs.add(song);

       // Esto es lo unico que necesito aca para crear lista o card
        RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.my_recycler_view_song);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new SongsAdapter(songs, R.layout.row_songs));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
