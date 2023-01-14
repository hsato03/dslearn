package com.devsuperior.dslearnbds.entities;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Embeddable
public class EnrollmentPK implements Serializable {

    private static final long serialVersionUID = 3328933473037453502L;

    @ManyToOne
    private Offer offer;

    @ManyToOne
    private User user;

    public EnrollmentPK() {}

    public EnrollmentPK(Offer offer, User user) {
        this.offer = offer;
        this.user = user;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnrollmentPK that = (EnrollmentPK) o;
        return Objects.equals(offer, that.offer) && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offer, user);
    }
}
