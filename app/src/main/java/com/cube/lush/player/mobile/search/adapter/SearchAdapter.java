package com.cube.lush.player.mobile.search.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cube.lush.player.R;
import com.cube.lush.player.api.model.SearchResult;
import com.cube.lush.player.mobile.search.holder.SearchViewHolder;
import com.lush.lib.adapter.BaseSelectableListAdapter;
import com.lush.lib.listener.OnListItemClickListener;
import com.lush.view.holder.BaseViewHolder;

import java.util.List;

/**
 * Created by Jamie Cruwys of 3 SIDED CUBE on 04/04/2017.
 */
public class SearchAdapter extends BaseSelectableListAdapter<SearchResult>
{
	public SearchAdapter(List<SearchResult> items, OnListItemClickListener<SearchResult> listener)
	{
		super(items, listener);
	}

	@Override public BaseViewHolder<SearchResult> onCreateViewHolder(ViewGroup parent, int viewType)
	{
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_item, parent, false);
		return new SearchViewHolder(view);
	}
}