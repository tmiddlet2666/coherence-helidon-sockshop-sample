/*
 * Copyright (c) 2020,2021 Oracle and/or its affiliates.
 *
 * Licensed under the Universal Permissive License v 1.0 as shown at
 * https://oss.oracle.com/licenses/upl.
 */

package io.helidon.examples.sockshop.carts;

import javax.enterprise.inject.spi.CDI;
import org.junit.jupiter.api.Disabled;

/**
 * Integration tests for {@link io.helidon.examples.sockshop.carts.CartResourceAsync}.
 */
public class CartResourceAsyncIT extends CartResourceIT {
    protected String getBasePath() {
        return "/carts-async";
    }

    protected CartRepository getCartsRepository() {
        return new SyncCartRepository(CDI.current().select(CartRepositoryAsync.class).get());
    }
}
