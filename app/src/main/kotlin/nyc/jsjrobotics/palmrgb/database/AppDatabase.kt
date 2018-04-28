package nyc.jsjrobotics.palmrgb.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters


@Database(
        entities = arrayOf(
                MutableRgbFrame::class,
                MutableColorOption::class,
                MutablePalette::class
        ),
        version = 1
)

@TypeConverters(value = arrayOf(Converters::class))
abstract class AppDatabase : RoomDatabase() {

    companion object {
        const val FILENAME: String = "PalmRgbAppDatabase.db"

        const val RGB_FRAMES_TABLE_NAME = "rgbFrames"
        const val FRAME_NAME_COLUMN = "frame_name"
        const val COLOR_LIST_COLUMN = "color_list"
        const val FRAME_ID_COLUMN = "frame_id"
        const val MATRIX_TYPE_COLUMN = "matrix_type"


        const val SAVED_COLORS_TABLE_NAME = "savedColors"
        const val COLOR_NAME_COLUMN = "color_name"
        const val COLOR_VALUE_COLUMN = "color_value"


        const val SAVED_PALETTES_TABLE_NAME = "savedPalettes"
        const val PALETTE_NAME_COLUMN = "color_name"
        const val PALETTE_VALUE_COLUMN = "color_value"

    }

    abstract fun rgbFramesDao(): RgbFramesDao

    abstract fun savedColorsDao() : SavedColorsDao
    abstract fun savedPalettesDao() : SavedPalettesDao
}