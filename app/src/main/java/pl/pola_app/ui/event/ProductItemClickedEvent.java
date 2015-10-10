package pl.pola_app.ui.event;

import android.support.v7.widget.CardView;

import com.squareup.otto.Produce;

import pl.pola_app.model.Product;

/**
 * Created by grzegorzkapusta on 08.10.2015.
 */
public class ProductItemClickedEvent {
    public CardView productCard;
    public Product productItem;

    public ProductItemClickedEvent(CardView productCard, Product item) {
        this.productCard = productCard;
        this.productItem = item;
    }

}