/*
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package youtube.downloader.core.entity;

import youtube.downloader.core.ResolutionNote;

public class Resolution {
    public Resolution(String _id, String _resolution, String _format, String _type, ResolutionNote _notes) {
        id = _id;
        resolution = _resolution;
        format = _format;
        type = _type;
        notes = _notes;
    }

    public String id;
    public String resolution;
    public String format;
    public String type;
    public ResolutionNote notes;
}