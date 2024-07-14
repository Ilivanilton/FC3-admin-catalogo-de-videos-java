package com.fullcycle.admin.catalogo.infrastructure.category.presenters;

import com.fullcycle.admin.catalogo.application.category.create.CreateCategoryOutput;
import com.fullcycle.admin.catalogo.application.category.retrieve.get.CategoryOutput;
import com.fullcycle.admin.catalogo.application.category.retrieve.list.CategoryListOutput;
import com.fullcycle.admin.catalogo.infrastructure.category.models.CategoryIdResponse;
import com.fullcycle.admin.catalogo.infrastructure.category.models.CategoryResponse;
import com.fullcycle.admin.catalogo.infrastructure.category.models.CategoryListResponse;

public interface CategoryApiPresenter {

    static CategoryResponse present(final CategoryOutput output) {
        return new CategoryResponse(
                output.id().getValue(),
                output.name(),
                output.description(),
                output.isActive(),
                output.createdAt(),
                output.updatedAt(),
                output.deletedAt()
        );
    }

    static CategoryIdResponse present(final CreateCategoryOutput output) {
        return new CategoryIdResponse( output.id() );
    }

    /**
     * Este presenter(CategoryApiPresenter) transforma CategoryListOutput para CategoryListResponse
     * o id vem como objeto e 'e transformado para String
     * CategoryListResponse 'e mapeado como os dados serao renomeados para o front
     */
    static CategoryListResponse present(final CategoryListOutput output) {
        return new CategoryListResponse(
                output.id().getValue(),
                output.name(),
                output.description(),
                output.isActive(),
                output.createdAt(),
                output.deletedAt()
        );
    }
}
