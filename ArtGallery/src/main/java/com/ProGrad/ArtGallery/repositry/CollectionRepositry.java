package com.ProGrad.ArtGallery.repositry;

import com.ProGrad.ArtGallery.model.Collection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectionRepositry extends JpaRepository<Collection,Long> {
}
