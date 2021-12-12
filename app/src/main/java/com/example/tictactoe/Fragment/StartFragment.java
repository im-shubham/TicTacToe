package com.example.tictactoe.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

import com.example.tictactoe.MainActivity;
import com.example.tictactoe.R;

public class StartFragment extends Fragment {

    private Button btn_start;
    private RadioButton r_play_with_computer, r_2_player;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_start, container, false);
        btn_start = view.findViewById(R.id.btn_start);
        r_play_with_computer = view.findViewById(R.id.r_play_with_computer);
        r_2_player = view.findViewById(R.id.r_play_2_player);
        r_play_with_computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.multiPlayer = false;
            }
        });
        r_2_player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.multiPlayer = true;
            }
        });
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.scoreO = 0;
                MainActivity.scoreX = 0;
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.addToBackStack(GameFragment.TAG);
                transaction.replace(R.id.frame_main, new GameFragment());
                transaction.commit();
            }
        });
        return view;
    }
}