/*
 * This file is part of Flow NBT, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2011 Flow Powered <https://flowpowered.com/>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.flowpowered.nbt;

import java.util.Optional;

/**
 * The {@code TAG_Short} tag. This is not part of the official NBT specification; do not use if you want to be fully NBT compliant.
 */
public final class ShortTag extends Tag<Short> {
    /**
     * The value.
     */
    private short value;

    /**
     * Creates the tag.
     *
     * @param name The name.
     * @param value The value.
     */
    public ShortTag(String name, short value) {
        super(TagType.TAG_SHORT, name);
        this.value = value;
    }

    @Override
    public Short getValue() {
        return value;
    }

    @Override
    public void setValue(Short value) {
        this.value = value;
    }

	@Override
	public Optional<ShortTag> getAsShortTag() {
		return Optional.of(this);
	}

    @Override
    public String toString() {
        String name = getName();
        String append = "";
        if (name != null && !name.equals("")) {
            append = "(\"" + this.getName() + "\")";
        }
        return "TAG_Short" + append + ": " + value;
    }

    @Override
	public ShortTag clone() {
        return new ShortTag(getName(), value);
    }
}
