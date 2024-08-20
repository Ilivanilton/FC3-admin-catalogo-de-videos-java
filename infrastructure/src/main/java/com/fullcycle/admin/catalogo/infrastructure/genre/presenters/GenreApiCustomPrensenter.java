package com.fullcycle.admin.catalogo.infrastructure.genre.presenters;

import com.fullcycle.admin.catalogo.domain.pagination.Pagination;
import com.fullcycle.admin.catalogo.infrastructure.genre.models.GenreListCustomResponse;
import com.fullcycle.admin.catalogo.infrastructure.genre.models.GenreListResponse;
import com.fullcycle.admin.catalogo.infrastructure.genre.models.Meta;

public interface GenreApiCustomPrensenter {

    static GenreListCustomResponse present(final Pagination<GenreListResponse> output){
        return new GenreListCustomResponse(
                output.items(),
                "linkss",
                new Meta(1,1,1,"11",1,1,1)
        );
    }

}
