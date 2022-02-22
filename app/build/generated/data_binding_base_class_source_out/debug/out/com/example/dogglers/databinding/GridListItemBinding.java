// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class GridListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView imageViewLeroy;

  @NonNull
  public final TextView textViewDogAge;

  @NonNull
  public final TextView textViewDogHobbies;

  @NonNull
  public final TextView textViewDogName;

  private GridListItemBinding(@NonNull MaterialCardView rootView, @NonNull ImageView imageViewLeroy,
      @NonNull TextView textViewDogAge, @NonNull TextView textViewDogHobbies,
      @NonNull TextView textViewDogName) {
    this.rootView = rootView;
    this.imageViewLeroy = imageViewLeroy;
    this.textViewDogAge = textViewDogAge;
    this.textViewDogHobbies = textViewDogHobbies;
    this.textViewDogName = textViewDogName;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.grid_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GridListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image_view_leroy;
      ImageView imageViewLeroy = rootView.findViewById(id);
      if (imageViewLeroy == null) {
        break missingId;
      }

      id = R.id.text_view_dog_age;
      TextView textViewDogAge = rootView.findViewById(id);
      if (textViewDogAge == null) {
        break missingId;
      }

      id = R.id.text_view_dog_hobbies;
      TextView textViewDogHobbies = rootView.findViewById(id);
      if (textViewDogHobbies == null) {
        break missingId;
      }

      id = R.id.text_view_dog_name;
      TextView textViewDogName = rootView.findViewById(id);
      if (textViewDogName == null) {
        break missingId;
      }

      return new GridListItemBinding((MaterialCardView) rootView, imageViewLeroy, textViewDogAge,
          textViewDogHobbies, textViewDogName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
