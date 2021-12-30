package libsokol

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scalanative.libc.*

object predef:  
  abstract class CEnum[T](using eq: T =:= Int):
    given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
    extension (t: T) def int: CInt = eq.apply(t)
  
  abstract class CEnumU[T](using eq: T =:= UInt):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
        
object types:
  import predef.*
  opaque type sg_action = CUnsignedInt
  object sg_action extends CEnumU[sg_action]:
    inline def define(inline a: Long): sg_action = a.toUInt
    val _SG_ACTION_DEFAULT = define(0)
    val SG_ACTION_CLEAR = define(1)
    val SG_ACTION_LOAD = define(2)
    val SG_ACTION_DONTCARE = define(3)
    val _SG_ACTION_NUM = define(4)
    val _SG_ACTION_FORCE_U32 = define(2147483647)

  opaque type sg_backend = CUnsignedInt
  object sg_backend extends CEnumU[sg_backend]:
    inline def define(inline a: Long): sg_backend = a.toUInt
    val SG_BACKEND_GLCORE33 = define(0)
    val SG_BACKEND_GLES2 = define(1)
    val SG_BACKEND_GLES3 = define(2)
    val SG_BACKEND_D3D11 = define(3)
    val SG_BACKEND_METAL_IOS = define(4)
    val SG_BACKEND_METAL_MACOS = define(5)
    val SG_BACKEND_METAL_SIMULATOR = define(6)
    val SG_BACKEND_WGPU = define(7)
    val SG_BACKEND_DUMMY = define(8)

  opaque type sg_blend_factor = CUnsignedInt
  object sg_blend_factor extends CEnumU[sg_blend_factor]:
    inline def define(inline a: Long): sg_blend_factor = a.toUInt
    val _SG_BLENDFACTOR_DEFAULT = define(0)
    val SG_BLENDFACTOR_ZERO = define(1)
    val SG_BLENDFACTOR_ONE = define(2)
    val SG_BLENDFACTOR_SRC_COLOR = define(3)
    val SG_BLENDFACTOR_ONE_MINUS_SRC_COLOR = define(4)
    val SG_BLENDFACTOR_SRC_ALPHA = define(5)
    val SG_BLENDFACTOR_ONE_MINUS_SRC_ALPHA = define(6)
    val SG_BLENDFACTOR_DST_COLOR = define(7)
    val SG_BLENDFACTOR_ONE_MINUS_DST_COLOR = define(8)
    val SG_BLENDFACTOR_DST_ALPHA = define(9)
    val SG_BLENDFACTOR_ONE_MINUS_DST_ALPHA = define(10)
    val SG_BLENDFACTOR_SRC_ALPHA_SATURATED = define(11)
    val SG_BLENDFACTOR_BLEND_COLOR = define(12)
    val SG_BLENDFACTOR_ONE_MINUS_BLEND_COLOR = define(13)
    val SG_BLENDFACTOR_BLEND_ALPHA = define(14)
    val SG_BLENDFACTOR_ONE_MINUS_BLEND_ALPHA = define(15)
    val _SG_BLENDFACTOR_NUM = define(16)
    val _SG_BLENDFACTOR_FORCE_U32 = define(2147483647)

  opaque type sg_blend_op = CUnsignedInt
  object sg_blend_op extends CEnumU[sg_blend_op]:
    inline def define(inline a: Long): sg_blend_op = a.toUInt
    val _SG_BLENDOP_DEFAULT = define(0)
    val SG_BLENDOP_ADD = define(1)
    val SG_BLENDOP_SUBTRACT = define(2)
    val SG_BLENDOP_REVERSE_SUBTRACT = define(3)
    val _SG_BLENDOP_NUM = define(4)
    val _SG_BLENDOP_FORCE_U32 = define(2147483647)

  opaque type sg_border_color = CUnsignedInt
  object sg_border_color extends CEnumU[sg_border_color]:
    inline def define(inline a: Long): sg_border_color = a.toUInt
    val _SG_BORDERCOLOR_DEFAULT = define(0)
    val SG_BORDERCOLOR_TRANSPARENT_BLACK = define(1)
    val SG_BORDERCOLOR_OPAQUE_BLACK = define(2)
    val SG_BORDERCOLOR_OPAQUE_WHITE = define(3)
    val _SG_BORDERCOLOR_NUM = define(4)
    val _SG_BORDERCOLOR_FORCE_U32 = define(2147483647)

  opaque type sg_buffer_type = CUnsignedInt
  object sg_buffer_type extends CEnumU[sg_buffer_type]:
    inline def define(inline a: Long): sg_buffer_type = a.toUInt
    val _SG_BUFFERTYPE_DEFAULT = define(0)
    val SG_BUFFERTYPE_VERTEXBUFFER = define(1)
    val SG_BUFFERTYPE_INDEXBUFFER = define(2)
    val _SG_BUFFERTYPE_NUM = define(3)
    val _SG_BUFFERTYPE_FORCE_U32 = define(2147483647)

  opaque type sg_color_mask = CUnsignedInt
  object sg_color_mask extends CEnumU[sg_color_mask]:
    inline def define(inline a: Long): sg_color_mask = a.toUInt
    val _SG_COLORMASK_DEFAULT = define(0)
    val SG_COLORMASK_NONE = define(16)
    val SG_COLORMASK_R = define(1)
    val SG_COLORMASK_G = define(2)
    val SG_COLORMASK_RG = define(3)
    val SG_COLORMASK_B = define(4)
    val SG_COLORMASK_RB = define(5)
    val SG_COLORMASK_GB = define(6)
    val SG_COLORMASK_RGB = define(7)
    val SG_COLORMASK_A = define(8)
    val SG_COLORMASK_RA = define(9)
    val SG_COLORMASK_GA = define(10)
    val SG_COLORMASK_RGA = define(11)
    val SG_COLORMASK_BA = define(12)
    val SG_COLORMASK_RBA = define(13)
    val SG_COLORMASK_GBA = define(14)
    val SG_COLORMASK_RGBA = define(15)
    val _SG_COLORMASK_FORCE_U32 = define(2147483647)

  opaque type sg_compare_func = CUnsignedInt
  object sg_compare_func extends CEnumU[sg_compare_func]:
    inline def define(inline a: Long): sg_compare_func = a.toUInt
    val _SG_COMPAREFUNC_DEFAULT = define(0)
    val SG_COMPAREFUNC_NEVER = define(1)
    val SG_COMPAREFUNC_LESS = define(2)
    val SG_COMPAREFUNC_EQUAL = define(3)
    val SG_COMPAREFUNC_LESS_EQUAL = define(4)
    val SG_COMPAREFUNC_GREATER = define(5)
    val SG_COMPAREFUNC_NOT_EQUAL = define(6)
    val SG_COMPAREFUNC_GREATER_EQUAL = define(7)
    val SG_COMPAREFUNC_ALWAYS = define(8)
    val _SG_COMPAREFUNC_NUM = define(9)
    val _SG_COMPAREFUNC_FORCE_U32 = define(2147483647)

  opaque type sg_cube_face = CUnsignedInt
  object sg_cube_face extends CEnumU[sg_cube_face]:
    inline def define(inline a: Long): sg_cube_face = a.toUInt
    val SG_CUBEFACE_POS_X = define(0)
    val SG_CUBEFACE_NEG_X = define(1)
    val SG_CUBEFACE_POS_Y = define(2)
    val SG_CUBEFACE_NEG_Y = define(3)
    val SG_CUBEFACE_POS_Z = define(4)
    val SG_CUBEFACE_NEG_Z = define(5)
    val SG_CUBEFACE_NUM = define(6)
    val _SG_CUBEFACE_FORCE_U32 = define(2147483647)

  opaque type sg_cull_mode = CUnsignedInt
  object sg_cull_mode extends CEnumU[sg_cull_mode]:
    inline def define(inline a: Long): sg_cull_mode = a.toUInt
    val _SG_CULLMODE_DEFAULT = define(0)
    val SG_CULLMODE_NONE = define(1)
    val SG_CULLMODE_FRONT = define(2)
    val SG_CULLMODE_BACK = define(3)
    val _SG_CULLMODE_NUM = define(4)
    val _SG_CULLMODE_FORCE_U32 = define(2147483647)

  opaque type sg_face_winding = CUnsignedInt
  object sg_face_winding extends CEnumU[sg_face_winding]:
    inline def define(inline a: Long): sg_face_winding = a.toUInt
    val _SG_FACEWINDING_DEFAULT = define(0)
    val SG_FACEWINDING_CCW = define(1)
    val SG_FACEWINDING_CW = define(2)
    val _SG_FACEWINDING_NUM = define(3)
    val _SG_FACEWINDING_FORCE_U32 = define(2147483647)

  opaque type sg_filter = CUnsignedInt
  object sg_filter extends CEnumU[sg_filter]:
    inline def define(inline a: Long): sg_filter = a.toUInt
    val _SG_FILTER_DEFAULT = define(0)
    val SG_FILTER_NEAREST = define(1)
    val SG_FILTER_LINEAR = define(2)
    val SG_FILTER_NEAREST_MIPMAP_NEAREST = define(3)
    val SG_FILTER_NEAREST_MIPMAP_LINEAR = define(4)
    val SG_FILTER_LINEAR_MIPMAP_NEAREST = define(5)
    val SG_FILTER_LINEAR_MIPMAP_LINEAR = define(6)
    val _SG_FILTER_NUM = define(7)
    val _SG_FILTER_FORCE_U32 = define(2147483647)

  opaque type sg_image_type = CUnsignedInt
  object sg_image_type extends CEnumU[sg_image_type]:
    inline def define(inline a: Long): sg_image_type = a.toUInt
    val _SG_IMAGETYPE_DEFAULT = define(0)
    val SG_IMAGETYPE_2D = define(1)
    val SG_IMAGETYPE_CUBE = define(2)
    val SG_IMAGETYPE_3D = define(3)
    val SG_IMAGETYPE_ARRAY = define(4)
    val _SG_IMAGETYPE_NUM = define(5)
    val _SG_IMAGETYPE_FORCE_U32 = define(2147483647)

  opaque type sg_index_type = CUnsignedInt
  object sg_index_type extends CEnumU[sg_index_type]:
    inline def define(inline a: Long): sg_index_type = a.toUInt
    val _SG_INDEXTYPE_DEFAULT = define(0)
    val SG_INDEXTYPE_NONE = define(1)
    val SG_INDEXTYPE_UINT16 = define(2)
    val SG_INDEXTYPE_UINT32 = define(3)
    val _SG_INDEXTYPE_NUM = define(4)
    val _SG_INDEXTYPE_FORCE_U32 = define(2147483647)

  opaque type sg_pixel_format = CUnsignedInt
  object sg_pixel_format extends CEnumU[sg_pixel_format]:
    inline def define(inline a: Long): sg_pixel_format = a.toUInt
    val _SG_PIXELFORMAT_DEFAULT = define(0)
    val SG_PIXELFORMAT_NONE = define(1)
    val SG_PIXELFORMAT_R8 = define(2)
    val SG_PIXELFORMAT_R8SN = define(3)
    val SG_PIXELFORMAT_R8UI = define(4)
    val SG_PIXELFORMAT_R8SI = define(5)
    val SG_PIXELFORMAT_R16 = define(6)
    val SG_PIXELFORMAT_R16SN = define(7)
    val SG_PIXELFORMAT_R16UI = define(8)
    val SG_PIXELFORMAT_R16SI = define(9)
    val SG_PIXELFORMAT_R16F = define(10)
    val SG_PIXELFORMAT_RG8 = define(11)
    val SG_PIXELFORMAT_RG8SN = define(12)
    val SG_PIXELFORMAT_RG8UI = define(13)
    val SG_PIXELFORMAT_RG8SI = define(14)
    val SG_PIXELFORMAT_R32UI = define(15)
    val SG_PIXELFORMAT_R32SI = define(16)
    val SG_PIXELFORMAT_R32F = define(17)
    val SG_PIXELFORMAT_RG16 = define(18)
    val SG_PIXELFORMAT_RG16SN = define(19)
    val SG_PIXELFORMAT_RG16UI = define(20)
    val SG_PIXELFORMAT_RG16SI = define(21)
    val SG_PIXELFORMAT_RG16F = define(22)
    val SG_PIXELFORMAT_RGBA8 = define(23)
    val SG_PIXELFORMAT_RGBA8SN = define(24)
    val SG_PIXELFORMAT_RGBA8UI = define(25)
    val SG_PIXELFORMAT_RGBA8SI = define(26)
    val SG_PIXELFORMAT_BGRA8 = define(27)
    val SG_PIXELFORMAT_RGB10A2 = define(28)
    val SG_PIXELFORMAT_RG11B10F = define(29)
    val SG_PIXELFORMAT_RG32UI = define(30)
    val SG_PIXELFORMAT_RG32SI = define(31)
    val SG_PIXELFORMAT_RG32F = define(32)
    val SG_PIXELFORMAT_RGBA16 = define(33)
    val SG_PIXELFORMAT_RGBA16SN = define(34)
    val SG_PIXELFORMAT_RGBA16UI = define(35)
    val SG_PIXELFORMAT_RGBA16SI = define(36)
    val SG_PIXELFORMAT_RGBA16F = define(37)
    val SG_PIXELFORMAT_RGBA32UI = define(38)
    val SG_PIXELFORMAT_RGBA32SI = define(39)
    val SG_PIXELFORMAT_RGBA32F = define(40)
    val SG_PIXELFORMAT_DEPTH = define(41)
    val SG_PIXELFORMAT_DEPTH_STENCIL = define(42)
    val SG_PIXELFORMAT_BC1_RGBA = define(43)
    val SG_PIXELFORMAT_BC2_RGBA = define(44)
    val SG_PIXELFORMAT_BC3_RGBA = define(45)
    val SG_PIXELFORMAT_BC4_R = define(46)
    val SG_PIXELFORMAT_BC4_RSN = define(47)
    val SG_PIXELFORMAT_BC5_RG = define(48)
    val SG_PIXELFORMAT_BC5_RGSN = define(49)
    val SG_PIXELFORMAT_BC6H_RGBF = define(50)
    val SG_PIXELFORMAT_BC6H_RGBUF = define(51)
    val SG_PIXELFORMAT_BC7_RGBA = define(52)
    val SG_PIXELFORMAT_PVRTC_RGB_2BPP = define(53)
    val SG_PIXELFORMAT_PVRTC_RGB_4BPP = define(54)
    val SG_PIXELFORMAT_PVRTC_RGBA_2BPP = define(55)
    val SG_PIXELFORMAT_PVRTC_RGBA_4BPP = define(56)
    val SG_PIXELFORMAT_ETC2_RGB8 = define(57)
    val SG_PIXELFORMAT_ETC2_RGB8A1 = define(58)
    val SG_PIXELFORMAT_ETC2_RGBA8 = define(59)
    val SG_PIXELFORMAT_ETC2_RG11 = define(60)
    val SG_PIXELFORMAT_ETC2_RG11SN = define(61)
    val _SG_PIXELFORMAT_NUM = define(62)
    val _SG_PIXELFORMAT_FORCE_U32 = define(2147483647)

  opaque type sg_primitive_type = CUnsignedInt
  object sg_primitive_type extends CEnumU[sg_primitive_type]:
    inline def define(inline a: Long): sg_primitive_type = a.toUInt
    val _SG_PRIMITIVETYPE_DEFAULT = define(0)
    val SG_PRIMITIVETYPE_POINTS = define(1)
    val SG_PRIMITIVETYPE_LINES = define(2)
    val SG_PRIMITIVETYPE_LINE_STRIP = define(3)
    val SG_PRIMITIVETYPE_TRIANGLES = define(4)
    val SG_PRIMITIVETYPE_TRIANGLE_STRIP = define(5)
    val _SG_PRIMITIVETYPE_NUM = define(6)
    val _SG_PRIMITIVETYPE_FORCE_U32 = define(2147483647)

  opaque type sg_resource_state = CUnsignedInt
  object sg_resource_state extends CEnumU[sg_resource_state]:
    inline def define(inline a: Long): sg_resource_state = a.toUInt
    val SG_RESOURCESTATE_INITIAL = define(0)
    val SG_RESOURCESTATE_ALLOC = define(1)
    val SG_RESOURCESTATE_VALID = define(2)
    val SG_RESOURCESTATE_FAILED = define(3)
    val SG_RESOURCESTATE_INVALID = define(4)
    val _SG_RESOURCESTATE_FORCE_U32 = define(2147483647)

  opaque type sg_sampler_type = CUnsignedInt
  object sg_sampler_type extends CEnumU[sg_sampler_type]:
    inline def define(inline a: Long): sg_sampler_type = a.toUInt
    val _SG_SAMPLERTYPE_DEFAULT = define(0)
    val SG_SAMPLERTYPE_FLOAT = define(1)
    val SG_SAMPLERTYPE_SINT = define(2)
    val SG_SAMPLERTYPE_UINT = define(3)

  opaque type sg_shader_stage = CUnsignedInt
  object sg_shader_stage extends CEnumU[sg_shader_stage]:
    inline def define(inline a: Long): sg_shader_stage = a.toUInt
    val SG_SHADERSTAGE_VS = define(0)
    val SG_SHADERSTAGE_FS = define(1)
    val _SG_SHADERSTAGE_FORCE_U32 = define(2147483647)

  opaque type sg_stencil_op = CUnsignedInt
  object sg_stencil_op extends CEnumU[sg_stencil_op]:
    inline def define(inline a: Long): sg_stencil_op = a.toUInt
    val _SG_STENCILOP_DEFAULT = define(0)
    val SG_STENCILOP_KEEP = define(1)
    val SG_STENCILOP_ZERO = define(2)
    val SG_STENCILOP_REPLACE = define(3)
    val SG_STENCILOP_INCR_CLAMP = define(4)
    val SG_STENCILOP_DECR_CLAMP = define(5)
    val SG_STENCILOP_INVERT = define(6)
    val SG_STENCILOP_INCR_WRAP = define(7)
    val SG_STENCILOP_DECR_WRAP = define(8)
    val _SG_STENCILOP_NUM = define(9)
    val _SG_STENCILOP_FORCE_U32 = define(2147483647)

  opaque type sg_uniform_type = CUnsignedInt
  object sg_uniform_type extends CEnumU[sg_uniform_type]:
    inline def define(inline a: Long): sg_uniform_type = a.toUInt
    val SG_UNIFORMTYPE_INVALID = define(0)
    val SG_UNIFORMTYPE_FLOAT = define(1)
    val SG_UNIFORMTYPE_FLOAT2 = define(2)
    val SG_UNIFORMTYPE_FLOAT3 = define(3)
    val SG_UNIFORMTYPE_FLOAT4 = define(4)
    val SG_UNIFORMTYPE_MAT4 = define(5)
    val _SG_UNIFORMTYPE_NUM = define(6)
    val _SG_UNIFORMTYPE_FORCE_U32 = define(2147483647)

  opaque type sg_usage = CUnsignedInt
  object sg_usage extends CEnumU[sg_usage]:
    inline def define(inline a: Long): sg_usage = a.toUInt
    val _SG_USAGE_DEFAULT = define(0)
    val SG_USAGE_IMMUTABLE = define(1)
    val SG_USAGE_DYNAMIC = define(2)
    val SG_USAGE_STREAM = define(3)
    val _SG_USAGE_NUM = define(4)
    val _SG_USAGE_FORCE_U32 = define(2147483647)

  opaque type sg_vertex_format = CUnsignedInt
  object sg_vertex_format extends CEnumU[sg_vertex_format]:
    inline def define(inline a: Long): sg_vertex_format = a.toUInt
    val SG_VERTEXFORMAT_INVALID = define(0)
    val SG_VERTEXFORMAT_FLOAT = define(1)
    val SG_VERTEXFORMAT_FLOAT2 = define(2)
    val SG_VERTEXFORMAT_FLOAT3 = define(3)
    val SG_VERTEXFORMAT_FLOAT4 = define(4)
    val SG_VERTEXFORMAT_BYTE4 = define(5)
    val SG_VERTEXFORMAT_BYTE4N = define(6)
    val SG_VERTEXFORMAT_UBYTE4 = define(7)
    val SG_VERTEXFORMAT_UBYTE4N = define(8)
    val SG_VERTEXFORMAT_SHORT2 = define(9)
    val SG_VERTEXFORMAT_SHORT2N = define(10)
    val SG_VERTEXFORMAT_USHORT2N = define(11)
    val SG_VERTEXFORMAT_SHORT4 = define(12)
    val SG_VERTEXFORMAT_SHORT4N = define(13)
    val SG_VERTEXFORMAT_USHORT4N = define(14)
    val SG_VERTEXFORMAT_UINT10_N2 = define(15)
    val _SG_VERTEXFORMAT_NUM = define(16)
    val _SG_VERTEXFORMAT_FORCE_U32 = define(2147483647)

  opaque type sg_vertex_step = CUnsignedInt
  object sg_vertex_step extends CEnumU[sg_vertex_step]:
    inline def define(inline a: Long): sg_vertex_step = a.toUInt
    val _SG_VERTEXSTEP_DEFAULT = define(0)
    val SG_VERTEXSTEP_PER_VERTEX = define(1)
    val SG_VERTEXSTEP_PER_INSTANCE = define(2)
    val _SG_VERTEXSTEP_NUM = define(3)
    val _SG_VERTEXSTEP_FORCE_U32 = define(2147483647)

  opaque type sg_wrap = CUnsignedInt
  object sg_wrap extends CEnumU[sg_wrap]:
    inline def define(inline a: Long): sg_wrap = a.toUInt
    val _SG_WRAP_DEFAULT = define(0)
    val SG_WRAP_REPEAT = define(1)
    val SG_WRAP_CLAMP_TO_EDGE = define(2)
    val SG_WRAP_CLAMP_TO_BORDER = define(3)
    val SG_WRAP_MIRRORED_REPEAT = define(4)
    val _SG_WRAP_NUM = define(5)
    val _SG_WRAP_FORCE_U32 = define(2147483647)

  opaque type __builtin_va_list = CString
  object __builtin_va_list: 
    given _tag: Tag[__builtin_va_list] = Tag.Ptr[CChar](Tag.Byte)
    inline def apply(inline o: CString): __builtin_va_list = o

  type __darwin_blkcnt_t = __int64_t
  object __darwin_blkcnt_t: 
    given _tag: Tag[__darwin_blkcnt_t] = __int64_t._tag

  type __darwin_blksize_t = __int32_t
  object __darwin_blksize_t: 
    given _tag: Tag[__darwin_blksize_t] = __int32_t._tag

  opaque type __darwin_clock_t = CUnsignedLongInt
  object __darwin_clock_t: 
    given _tag: Tag[__darwin_clock_t] = Tag.ULong
    inline def apply(inline o: CUnsignedLongInt): __darwin_clock_t = o

  opaque type __darwin_ct_rune_t = CInt
  object __darwin_ct_rune_t: 
    given _tag: Tag[__darwin_ct_rune_t] = Tag.Int
    inline def apply(inline o: CInt): __darwin_ct_rune_t = o

  type __darwin_dev_t = __int32_t
  object __darwin_dev_t: 
    given _tag: Tag[__darwin_dev_t] = __int32_t._tag

  opaque type __darwin_fsblkcnt_t = CUnsignedInt
  object __darwin_fsblkcnt_t: 
    given _tag: Tag[__darwin_fsblkcnt_t] = Tag.UInt
    inline def apply(inline o: CUnsignedInt): __darwin_fsblkcnt_t = o

  opaque type __darwin_fsfilcnt_t = CUnsignedInt
  object __darwin_fsfilcnt_t: 
    given _tag: Tag[__darwin_fsfilcnt_t] = Tag.UInt
    inline def apply(inline o: CUnsignedInt): __darwin_fsfilcnt_t = o

  type __darwin_gid_t = __uint32_t
  object __darwin_gid_t: 
    given _tag: Tag[__darwin_gid_t] = __uint32_t._tag

  type __darwin_id_t = __uint32_t
  object __darwin_id_t: 
    given _tag: Tag[__darwin_id_t] = __uint32_t._tag

  type __darwin_ino64_t = __uint64_t
  object __darwin_ino64_t: 
    given _tag: Tag[__darwin_ino64_t] = __uint64_t._tag

  type __darwin_ino_t = __darwin_ino64_t
  object __darwin_ino_t: 
    given _tag: Tag[__darwin_ino_t] = __darwin_ino64_t._tag

  opaque type __darwin_intptr_t = CLongInt
  object __darwin_intptr_t: 
    given _tag: Tag[__darwin_intptr_t] = Tag.Long
    inline def apply(inline o: CLongInt): __darwin_intptr_t = o

  type __darwin_mach_port_name_t = __darwin_natural_t
  object __darwin_mach_port_name_t: 
    given _tag: Tag[__darwin_mach_port_name_t] = __darwin_natural_t._tag

  type __darwin_mach_port_t = __darwin_mach_port_name_t
  object __darwin_mach_port_t: 
    given _tag: Tag[__darwin_mach_port_t] = __darwin_mach_port_name_t._tag

  type __darwin_mbstate_t = __mbstate_t
  object __darwin_mbstate_t: 
    given _tag: Tag[__darwin_mbstate_t] = __mbstate_t._tag

  type __darwin_mode_t = __uint16_t
  object __darwin_mode_t: 
    given _tag: Tag[__darwin_mode_t] = __uint16_t._tag

  opaque type __darwin_natural_t = CUnsignedInt
  object __darwin_natural_t: 
    given _tag: Tag[__darwin_natural_t] = Tag.UInt
    inline def apply(inline o: CUnsignedInt): __darwin_natural_t = o

  opaque type __darwin_nl_item = CInt
  object __darwin_nl_item: 
    given _tag: Tag[__darwin_nl_item] = Tag.Int
    inline def apply(inline o: CInt): __darwin_nl_item = o

  type __darwin_off_t = __int64_t
  object __darwin_off_t: 
    given _tag: Tag[__darwin_off_t] = __int64_t._tag

  type __darwin_pid_t = __int32_t
  object __darwin_pid_t: 
    given _tag: Tag[__darwin_pid_t] = __int32_t._tag

  opaque type __darwin_pthread_key_t = CUnsignedLongInt
  object __darwin_pthread_key_t: 
    given _tag: Tag[__darwin_pthread_key_t] = Tag.ULong
    inline def apply(inline o: CUnsignedLongInt): __darwin_pthread_key_t = o

  opaque type __darwin_pthread_t = Ptr[_opaque_pthread_t]
  object __darwin_pthread_t: 
    given _tag: Tag[__darwin_pthread_t] = Tag.Ptr[_opaque_pthread_t](_opaque_pthread_t._tag)
    inline def apply(inline o: Ptr[_opaque_pthread_t]): __darwin_pthread_t = o

  opaque type __darwin_ptrdiff_t = CLongInt
  object __darwin_ptrdiff_t: 
    given _tag: Tag[__darwin_ptrdiff_t] = Tag.Long
    inline def apply(inline o: CLongInt): __darwin_ptrdiff_t = o

  type __darwin_rune_t = __darwin_wchar_t
  object __darwin_rune_t: 
    given _tag: Tag[__darwin_rune_t] = __darwin_wchar_t._tag

  type __darwin_sigset_t = __uint32_t
  object __darwin_sigset_t: 
    given _tag: Tag[__darwin_sigset_t] = __uint32_t._tag

  opaque type __darwin_size_t = CUnsignedLongInt
  object __darwin_size_t: 
    given _tag: Tag[__darwin_size_t] = Tag.ULong
    inline def apply(inline o: CUnsignedLongInt): __darwin_size_t = o

  type __darwin_socklen_t = __uint32_t
  object __darwin_socklen_t: 
    given _tag: Tag[__darwin_socklen_t] = __uint32_t._tag

  opaque type __darwin_ssize_t = CLongInt
  object __darwin_ssize_t: 
    given _tag: Tag[__darwin_ssize_t] = Tag.Long
    inline def apply(inline o: CLongInt): __darwin_ssize_t = o

  type __darwin_suseconds_t = __int32_t
  object __darwin_suseconds_t: 
    given _tag: Tag[__darwin_suseconds_t] = __int32_t._tag

  opaque type __darwin_time_t = CLongInt
  object __darwin_time_t: 
    given _tag: Tag[__darwin_time_t] = Tag.Long
    inline def apply(inline o: CLongInt): __darwin_time_t = o

  type __darwin_uid_t = __uint32_t
  object __darwin_uid_t: 
    given _tag: Tag[__darwin_uid_t] = __uint32_t._tag

  type __darwin_useconds_t = __uint32_t
  object __darwin_useconds_t: 
    given _tag: Tag[__darwin_useconds_t] = __uint32_t._tag

  opaque type __darwin_uuid_string_t = CArray[CChar, Nat.Digit2[Nat._3, Nat._7]]
  object __darwin_uuid_string_t: 
    given _tag: Tag[__darwin_uuid_string_t] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._7]](Tag.Byte, Tag.Digit2[Nat._3, Nat._7](Tag.Nat3, Tag.Nat7))
    inline def apply(inline o: CArray[CChar, Nat.Digit2[Nat._3, Nat._7]]): __darwin_uuid_string_t = o

  opaque type __darwin_uuid_t = CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]]
  object __darwin_uuid_t: 
    given _tag: Tag[__darwin_uuid_t] = Tag.CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]](Tag.UByte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
    inline def apply(inline o: CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]]): __darwin_uuid_t = o

  type __darwin_va_list = __builtin_va_list
  object __darwin_va_list: 
    given _tag: Tag[__darwin_va_list] = __builtin_va_list._tag

  opaque type __darwin_wchar_t = CInt
  object __darwin_wchar_t: 
    given _tag: Tag[__darwin_wchar_t] = Tag.Int
    inline def apply(inline o: CInt): __darwin_wchar_t = o

  opaque type __darwin_wctrans_t = CInt
  object __darwin_wctrans_t: 
    given _tag: Tag[__darwin_wctrans_t] = Tag.Int
    inline def apply(inline o: CInt): __darwin_wctrans_t = o

  type __darwin_wctype_t = __uint32_t
  object __darwin_wctype_t: 
    given _tag: Tag[__darwin_wctype_t] = __uint32_t._tag

  opaque type __darwin_wint_t = CInt
  object __darwin_wint_t: 
    given _tag: Tag[__darwin_wint_t] = Tag.Int
    inline def apply(inline o: CInt): __darwin_wint_t = o

  opaque type __int16_t = CShort
  object __int16_t: 
    given _tag: Tag[__int16_t] = Tag.Short
    inline def apply(inline o: CShort): __int16_t = o

  opaque type __int32_t = CInt
  object __int32_t: 
    given _tag: Tag[__int32_t] = Tag.Int
    inline def apply(inline o: CInt): __int32_t = o

  opaque type __int64_t = CLongLong
  object __int64_t: 
    given _tag: Tag[__int64_t] = Tag.Long
    inline def apply(inline o: CLongLong): __int64_t = o

  opaque type __int8_t = CChar
  object __int8_t: 
    given _tag: Tag[__int8_t] = Tag.Byte
    inline def apply(inline o: CChar): __int8_t = o

  opaque type __uint16_t = CUnsignedShort
  object __uint16_t: 
    given _tag: Tag[__uint16_t] = Tag.UShort
    inline def apply(inline o: CUnsignedShort): __uint16_t = o

  opaque type __uint32_t = CUnsignedInt
  object __uint32_t: 
    given _tag: Tag[__uint32_t] = Tag.UInt
    inline def apply(inline o: CUnsignedInt): __uint32_t = o

  opaque type __uint64_t = CUnsignedLongLong
  object __uint64_t: 
    given _tag: Tag[__uint64_t] = Tag.ULong
    inline def apply(inline o: CUnsignedLongLong): __uint64_t = o

  opaque type __uint8_t = CUnsignedChar
  object __uint8_t: 
    given _tag: Tag[__uint8_t] = Tag.UByte
    inline def apply(inline o: CUnsignedChar): __uint8_t = o

  opaque type int16_t = CShort
  object int16_t: 
    given _tag: Tag[int16_t] = Tag.Short
    inline def apply(inline o: CShort): int16_t = o

  opaque type int32_t = CInt
  object int32_t: 
    given _tag: Tag[int32_t] = Tag.Int
    inline def apply(inline o: CInt): int32_t = o

  opaque type int64_t = CLongLong
  object int64_t: 
    given _tag: Tag[int64_t] = Tag.Long
    inline def apply(inline o: CLongLong): int64_t = o

  opaque type int8_t = CChar
  object int8_t: 
    given _tag: Tag[int8_t] = Tag.Byte
    inline def apply(inline o: CChar): int8_t = o

  type int_fast16_t = int16_t
  object int_fast16_t: 
    given _tag: Tag[int_fast16_t] = int16_t._tag

  type int_fast32_t = int32_t
  object int_fast32_t: 
    given _tag: Tag[int_fast32_t] = int32_t._tag

  type int_fast64_t = int64_t
  object int_fast64_t: 
    given _tag: Tag[int_fast64_t] = int64_t._tag

  type int_fast8_t = int8_t
  object int_fast8_t: 
    given _tag: Tag[int_fast8_t] = int8_t._tag

  type int_least16_t = int16_t
  object int_least16_t: 
    given _tag: Tag[int_least16_t] = int16_t._tag

  type int_least32_t = int32_t
  object int_least32_t: 
    given _tag: Tag[int_least32_t] = int32_t._tag

  type int_least64_t = int64_t
  object int_least64_t: 
    given _tag: Tag[int_least64_t] = int64_t._tag

  type int_least8_t = int8_t
  object int_least8_t: 
    given _tag: Tag[int_least8_t] = int8_t._tag

  opaque type intmax_t = CLongInt
  object intmax_t: 
    given _tag: Tag[intmax_t] = Tag.Long
    inline def apply(inline o: CLongInt): intmax_t = o

  type intptr_t = __darwin_intptr_t
  object intptr_t: 
    given _tag: Tag[intptr_t] = __darwin_intptr_t._tag

  opaque type max_align_t = Double
  object max_align_t: 
    given _tag: Tag[max_align_t] = Tag.Double
    inline def apply(inline o: Double): max_align_t = o

  type ptrdiff_t = __darwin_ptrdiff_t
  object ptrdiff_t: 
    given _tag: Tag[ptrdiff_t] = __darwin_ptrdiff_t._tag

  type register_t = int64_t
  object register_t: 
    given _tag: Tag[register_t] = int64_t._tag

  type rsize_t = __darwin_size_t
  object rsize_t: 
    given _tag: Tag[rsize_t] = __darwin_size_t._tag

  type size_t = __darwin_size_t
  object size_t: 
    given _tag: Tag[size_t] = __darwin_size_t._tag

  type syscall_arg_t = u_int64_t
  object syscall_arg_t: 
    given _tag: Tag[syscall_arg_t] = u_int64_t._tag

  opaque type u_int16_t = CUnsignedShort
  object u_int16_t: 
    given _tag: Tag[u_int16_t] = Tag.UShort
    inline def apply(inline o: CUnsignedShort): u_int16_t = o

  opaque type u_int32_t = CUnsignedInt
  object u_int32_t: 
    given _tag: Tag[u_int32_t] = Tag.UInt
    inline def apply(inline o: CUnsignedInt): u_int32_t = o

  opaque type u_int64_t = CUnsignedLongLong
  object u_int64_t: 
    given _tag: Tag[u_int64_t] = Tag.ULong
    inline def apply(inline o: CUnsignedLongLong): u_int64_t = o

  opaque type u_int8_t = CUnsignedChar
  object u_int8_t: 
    given _tag: Tag[u_int8_t] = Tag.UByte
    inline def apply(inline o: CUnsignedChar): u_int8_t = o

  opaque type uint16_t = CUnsignedShort
  object uint16_t: 
    given _tag: Tag[uint16_t] = Tag.UShort
    inline def apply(inline o: CUnsignedShort): uint16_t = o

  opaque type uint32_t = CUnsignedInt
  object uint32_t: 
    given _tag: Tag[uint32_t] = Tag.UInt
    inline def apply(inline o: CUnsignedInt): uint32_t = o

  opaque type uint64_t = CUnsignedLongLong
  object uint64_t: 
    given _tag: Tag[uint64_t] = Tag.ULong
    inline def apply(inline o: CUnsignedLongLong): uint64_t = o

  opaque type uint8_t = CUnsignedChar
  object uint8_t: 
    given _tag: Tag[uint8_t] = Tag.UByte
    inline def apply(inline o: CUnsignedChar): uint8_t = o

  type uint_fast16_t = uint16_t
  object uint_fast16_t: 
    given _tag: Tag[uint_fast16_t] = uint16_t._tag

  type uint_fast32_t = uint32_t
  object uint_fast32_t: 
    given _tag: Tag[uint_fast32_t] = uint32_t._tag

  type uint_fast64_t = uint64_t
  object uint_fast64_t: 
    given _tag: Tag[uint_fast64_t] = uint64_t._tag

  type uint_fast8_t = uint8_t
  object uint_fast8_t: 
    given _tag: Tag[uint_fast8_t] = uint8_t._tag

  type uint_least16_t = uint16_t
  object uint_least16_t: 
    given _tag: Tag[uint_least16_t] = uint16_t._tag

  type uint_least32_t = uint32_t
  object uint_least32_t: 
    given _tag: Tag[uint_least32_t] = uint32_t._tag

  type uint_least64_t = uint64_t
  object uint_least64_t: 
    given _tag: Tag[uint_least64_t] = uint64_t._tag

  type uint_least8_t = uint8_t
  object uint_least8_t: 
    given _tag: Tag[uint_least8_t] = uint8_t._tag

  opaque type uintmax_t = CUnsignedLongInt
  object uintmax_t: 
    given _tag: Tag[uintmax_t] = Tag.ULong
    inline def apply(inline o: CUnsignedLongInt): uintmax_t = o

  opaque type uintptr_t = CUnsignedLongInt
  object uintptr_t: 
    given _tag: Tag[uintptr_t] = Tag.ULong
    inline def apply(inline o: CUnsignedLongInt): uintptr_t = o

  type user_addr_t = u_int64_t
  object user_addr_t: 
    given _tag: Tag[user_addr_t] = u_int64_t._tag

  type user_long_t = int64_t
  object user_long_t: 
    given _tag: Tag[user_long_t] = int64_t._tag

  type user_off_t = int64_t
  object user_off_t: 
    given _tag: Tag[user_off_t] = int64_t._tag

  type user_size_t = u_int64_t
  object user_size_t: 
    given _tag: Tag[user_size_t] = u_int64_t._tag

  type user_ssize_t = int64_t
  object user_ssize_t: 
    given _tag: Tag[user_ssize_t] = int64_t._tag

  type user_time_t = int64_t
  object user_time_t: 
    given _tag: Tag[user_time_t] = int64_t._tag

  type user_ulong_t = u_int64_t
  object user_ulong_t: 
    given _tag: Tag[user_ulong_t] = u_int64_t._tag

  type wchar_t = __darwin_wchar_t
  object wchar_t: 
    given _tag: Tag[wchar_t] = __darwin_wchar_t._tag

  type wint_t = __darwin_wint_t
  object wint_t: 
    given _tag: Tag[wint_t] = __darwin_wint_t._tag
  opaque type __darwin_pthread_attr_t = CStruct2[CLongInt, CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]]
  object __darwin_pthread_attr_t:
    given _tag: Tag[__darwin_pthread_attr_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]]
    extension (struct: __darwin_pthread_attr_t)
      def __sig: CLongInt = struct._1
      def __sig_=(value: CLongInt): Unit = !struct.at1 = value
      def __opaque: CArray[CChar, Nat.Digit2[Nat._5, Nat._6]] = struct._2
      def __opaque_=(value: CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]): Unit = !struct.at2 = value

  opaque type __darwin_pthread_cond_t = CStruct2[CLongInt, CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]]
  object __darwin_pthread_cond_t:
    given _tag: Tag[__darwin_pthread_cond_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]]
    extension (struct: __darwin_pthread_cond_t)
      def __sig: CLongInt = struct._1
      def __sig_=(value: CLongInt): Unit = !struct.at1 = value
      def __opaque: CArray[CChar, Nat.Digit2[Nat._4, Nat._0]] = struct._2
      def __opaque_=(value: CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]): Unit = !struct.at2 = value

  opaque type __darwin_pthread_condattr_t = CStruct2[CLongInt, CArray[CChar, Nat._8]]
  object __darwin_pthread_condattr_t:
    given _tag: Tag[__darwin_pthread_condattr_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CChar, Nat._8]]
    extension (struct: __darwin_pthread_condattr_t)
      def __sig: CLongInt = struct._1
      def __sig_=(value: CLongInt): Unit = !struct.at1 = value
      def __opaque: CArray[CChar, Nat._8] = struct._2
      def __opaque_=(value: CArray[CChar, Nat._8]): Unit = !struct.at2 = value

  opaque type __darwin_pthread_handler_rec = CStruct3[Ptr[CFuncPtr1[Ptr[Byte], Unit]], Ptr[Byte], Ptr[Byte]]
  object __darwin_pthread_handler_rec:
    given _tag: Tag[__darwin_pthread_handler_rec] = Tag.materializeCStruct3Tag[Ptr[CFuncPtr1[Ptr[Byte], Unit]], Ptr[Byte], Ptr[Byte]]
    extension (struct: __darwin_pthread_handler_rec)
      def __routine: Ptr[CFuncPtr1[Ptr[Byte], Unit]] = struct._1
      def __routine_=(value: Ptr[CFuncPtr1[Ptr[Byte], Unit]]): Unit = !struct.at1 = value
      def __arg: Ptr[Byte] = struct._2
      def __arg_=(value: Ptr[Byte]): Unit = !struct.at2 = value
      def __next: Ptr[__darwin_pthread_handler_rec] = struct._3.asInstanceOf[Ptr[__darwin_pthread_handler_rec]]
      def __next_=(value: Ptr[__darwin_pthread_handler_rec]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]

  opaque type __darwin_pthread_mutex_t = CStruct2[CLongInt, CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]]
  object __darwin_pthread_mutex_t:
    given _tag: Tag[__darwin_pthread_mutex_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]]
    extension (struct: __darwin_pthread_mutex_t)
      def __sig: CLongInt = struct._1
      def __sig_=(value: CLongInt): Unit = !struct.at1 = value
      def __opaque: CArray[CChar, Nat.Digit2[Nat._5, Nat._6]] = struct._2
      def __opaque_=(value: CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]): Unit = !struct.at2 = value

  opaque type __darwin_pthread_mutexattr_t = CStruct2[CLongInt, CArray[CChar, Nat._8]]
  object __darwin_pthread_mutexattr_t:
    given _tag: Tag[__darwin_pthread_mutexattr_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CChar, Nat._8]]
    extension (struct: __darwin_pthread_mutexattr_t)
      def __sig: CLongInt = struct._1
      def __sig_=(value: CLongInt): Unit = !struct.at1 = value
      def __opaque: CArray[CChar, Nat._8] = struct._2
      def __opaque_=(value: CArray[CChar, Nat._8]): Unit = !struct.at2 = value

  opaque type __darwin_pthread_once_t = CStruct2[CLongInt, CArray[CChar, Nat._8]]
  object __darwin_pthread_once_t:
    given _tag: Tag[__darwin_pthread_once_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CChar, Nat._8]]
    extension (struct: __darwin_pthread_once_t)
      def __sig: CLongInt = struct._1
      def __sig_=(value: CLongInt): Unit = !struct.at1 = value
      def __opaque: CArray[CChar, Nat._8] = struct._2
      def __opaque_=(value: CArray[CChar, Nat._8]): Unit = !struct.at2 = value

  opaque type __darwin_pthread_rwlock_t = CStruct2[CLongInt, CArray[CChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]]]
  object __darwin_pthread_rwlock_t:
    given _tag: Tag[__darwin_pthread_rwlock_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]]]
    extension (struct: __darwin_pthread_rwlock_t)
      def __sig: CLongInt = struct._1
      def __sig_=(value: CLongInt): Unit = !struct.at1 = value
      def __opaque: CArray[CChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]] = struct._2
      def __opaque_=(value: CArray[CChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]]): Unit = !struct.at2 = value

  opaque type __darwin_pthread_rwlockattr_t = CStruct2[CLongInt, CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]]
  object __darwin_pthread_rwlockattr_t:
    given _tag: Tag[__darwin_pthread_rwlockattr_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]]
    extension (struct: __darwin_pthread_rwlockattr_t)
      def __sig: CLongInt = struct._1
      def __sig_=(value: CLongInt): Unit = !struct.at1 = value
      def __opaque: CArray[CChar, Nat.Digit2[Nat._1, Nat._6]] = struct._2
      def __opaque_=(value: CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at2 = value

  opaque type _opaque_pthread_attr_t = CStruct2[CLongInt, CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]]
  object _opaque_pthread_attr_t:
    given _tag: Tag[_opaque_pthread_attr_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]]
    extension (struct: _opaque_pthread_attr_t)
      def __sig: CLongInt = struct._1
      def __sig_=(value: CLongInt): Unit = !struct.at1 = value
      def __opaque: CArray[CChar, Nat.Digit2[Nat._5, Nat._6]] = struct._2
      def __opaque_=(value: CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]): Unit = !struct.at2 = value

  opaque type _opaque_pthread_cond_t = CStruct2[CLongInt, CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]]
  object _opaque_pthread_cond_t:
    given _tag: Tag[_opaque_pthread_cond_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]]
    extension (struct: _opaque_pthread_cond_t)
      def __sig: CLongInt = struct._1
      def __sig_=(value: CLongInt): Unit = !struct.at1 = value
      def __opaque: CArray[CChar, Nat.Digit2[Nat._4, Nat._0]] = struct._2
      def __opaque_=(value: CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]): Unit = !struct.at2 = value

  opaque type _opaque_pthread_condattr_t = CStruct2[CLongInt, CArray[CChar, Nat._8]]
  object _opaque_pthread_condattr_t:
    given _tag: Tag[_opaque_pthread_condattr_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CChar, Nat._8]]
    extension (struct: _opaque_pthread_condattr_t)
      def __sig: CLongInt = struct._1
      def __sig_=(value: CLongInt): Unit = !struct.at1 = value
      def __opaque: CArray[CChar, Nat._8] = struct._2
      def __opaque_=(value: CArray[CChar, Nat._8]): Unit = !struct.at2 = value

  opaque type _opaque_pthread_mutex_t = CStruct2[CLongInt, CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]]
  object _opaque_pthread_mutex_t:
    given _tag: Tag[_opaque_pthread_mutex_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]]
    extension (struct: _opaque_pthread_mutex_t)
      def __sig: CLongInt = struct._1
      def __sig_=(value: CLongInt): Unit = !struct.at1 = value
      def __opaque: CArray[CChar, Nat.Digit2[Nat._5, Nat._6]] = struct._2
      def __opaque_=(value: CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]): Unit = !struct.at2 = value

  opaque type _opaque_pthread_mutexattr_t = CStruct2[CLongInt, CArray[CChar, Nat._8]]
  object _opaque_pthread_mutexattr_t:
    given _tag: Tag[_opaque_pthread_mutexattr_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CChar, Nat._8]]
    extension (struct: _opaque_pthread_mutexattr_t)
      def __sig: CLongInt = struct._1
      def __sig_=(value: CLongInt): Unit = !struct.at1 = value
      def __opaque: CArray[CChar, Nat._8] = struct._2
      def __opaque_=(value: CArray[CChar, Nat._8]): Unit = !struct.at2 = value

  opaque type _opaque_pthread_once_t = CStruct2[CLongInt, CArray[CChar, Nat._8]]
  object _opaque_pthread_once_t:
    given _tag: Tag[_opaque_pthread_once_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CChar, Nat._8]]
    extension (struct: _opaque_pthread_once_t)
      def __sig: CLongInt = struct._1
      def __sig_=(value: CLongInt): Unit = !struct.at1 = value
      def __opaque: CArray[CChar, Nat._8] = struct._2
      def __opaque_=(value: CArray[CChar, Nat._8]): Unit = !struct.at2 = value

  opaque type _opaque_pthread_rwlock_t = CStruct2[CLongInt, CArray[CChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]]]
  object _opaque_pthread_rwlock_t:
    given _tag: Tag[_opaque_pthread_rwlock_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]]]
    extension (struct: _opaque_pthread_rwlock_t)
      def __sig: CLongInt = struct._1
      def __sig_=(value: CLongInt): Unit = !struct.at1 = value
      def __opaque: CArray[CChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]] = struct._2
      def __opaque_=(value: CArray[CChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]]): Unit = !struct.at2 = value

  opaque type _opaque_pthread_rwlockattr_t = CStruct2[CLongInt, CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]]
  object _opaque_pthread_rwlockattr_t:
    given _tag: Tag[_opaque_pthread_rwlockattr_t] = Tag.materializeCStruct2Tag[CLongInt, CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]]
    extension (struct: _opaque_pthread_rwlockattr_t)
      def __sig: CLongInt = struct._1
      def __sig_=(value: CLongInt): Unit = !struct.at1 = value
      def __opaque: CArray[CChar, Nat.Digit2[Nat._1, Nat._6]] = struct._2
      def __opaque_=(value: CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at2 = value

  opaque type _opaque_pthread_t = CStruct3[CLongInt, Ptr[__darwin_pthread_handler_rec], CArray[CChar, Nat.Digit4[Nat._8, Nat._1, Nat._7, Nat._6]]]
  object _opaque_pthread_t:
    given _tag: Tag[_opaque_pthread_t] = Tag.materializeCStruct3Tag[CLongInt, Ptr[__darwin_pthread_handler_rec], CArray[CChar, Nat.Digit4[Nat._8, Nat._1, Nat._7, Nat._6]]]
    extension (struct: _opaque_pthread_t)
      def __sig: CLongInt = struct._1
      def __sig_=(value: CLongInt): Unit = !struct.at1 = value
      def __cleanup_stack: Ptr[__darwin_pthread_handler_rec] = struct._2
      def __cleanup_stack_=(value: Ptr[__darwin_pthread_handler_rec]): Unit = !struct.at2 = value
      def __opaque: CArray[CChar, Nat.Digit4[Nat._8, Nat._1, Nat._7, Nat._6]] = struct._3
      def __opaque_=(value: CArray[CChar, Nat.Digit4[Nat._8, Nat._1, Nat._7, Nat._6]]): Unit = !struct.at3 = value

  opaque type sg_bindings = CStruct8[uint32_t, CArray[sg_buffer, Nat._8], CArray[CInt, Nat._8], sg_buffer, CInt, CArray[sg_image, Nat.Digit2[Nat._1, Nat._2]], CArray[sg_image, Nat.Digit2[Nat._1, Nat._2]], uint32_t]
  object sg_bindings:
    given _tag: Tag[sg_bindings] = Tag.materializeCStruct8Tag[uint32_t, CArray[sg_buffer, Nat._8], CArray[CInt, Nat._8], sg_buffer, CInt, CArray[sg_image, Nat.Digit2[Nat._1, Nat._2]], CArray[sg_image, Nat.Digit2[Nat._1, Nat._2]], uint32_t]
    extension (struct: sg_bindings)
      def _start_canary: uint32_t = struct._1
      def _start_canary_=(value: uint32_t): Unit = !struct.at1 = value
      def vertex_buffers: CArray[sg_buffer, Nat._8] = struct._2
      def vertex_buffers_=(value: CArray[sg_buffer, Nat._8]): Unit = !struct.at2 = value
      def vertex_buffer_offsets: CArray[CInt, Nat._8] = struct._3
      def vertex_buffer_offsets_=(value: CArray[CInt, Nat._8]): Unit = !struct.at3 = value
      def index_buffer: sg_buffer = struct._4
      def index_buffer_=(value: sg_buffer): Unit = !struct.at4 = value
      def index_buffer_offset: CInt = struct._5
      def index_buffer_offset_=(value: CInt): Unit = !struct.at5 = value
      def vs_images: CArray[sg_image, Nat.Digit2[Nat._1, Nat._2]] = struct._6
      def vs_images_=(value: CArray[sg_image, Nat.Digit2[Nat._1, Nat._2]]): Unit = !struct.at6 = value
      def fs_images: CArray[sg_image, Nat.Digit2[Nat._1, Nat._2]] = struct._7
      def fs_images_=(value: CArray[sg_image, Nat.Digit2[Nat._1, Nat._2]]): Unit = !struct.at7 = value
      def _end_canary: uint32_t = struct._8
      def _end_canary_=(value: uint32_t): Unit = !struct.at8 = value

  opaque type sg_blend_state = CStruct7[CInt, sg_blend_factor, sg_blend_factor, sg_blend_op, sg_blend_factor, sg_blend_factor, sg_blend_op]
  object sg_blend_state:
    given _tag: Tag[sg_blend_state] = Tag.materializeCStruct7Tag[CInt, sg_blend_factor, sg_blend_factor, sg_blend_op, sg_blend_factor, sg_blend_factor, sg_blend_op]
    extension (struct: sg_blend_state)
      def enabled: CInt = struct._1
      def enabled_=(value: CInt): Unit = !struct.at1 = value
      def src_factor_rgb: sg_blend_factor = struct._2
      def src_factor_rgb_=(value: sg_blend_factor): Unit = !struct.at2 = value
      def dst_factor_rgb: sg_blend_factor = struct._3
      def dst_factor_rgb_=(value: sg_blend_factor): Unit = !struct.at3 = value
      def op_rgb: sg_blend_op = struct._4
      def op_rgb_=(value: sg_blend_op): Unit = !struct.at4 = value
      def src_factor_alpha: sg_blend_factor = struct._5
      def src_factor_alpha_=(value: sg_blend_factor): Unit = !struct.at5 = value
      def dst_factor_alpha: sg_blend_factor = struct._6
      def dst_factor_alpha_=(value: sg_blend_factor): Unit = !struct.at6 = value
      def op_alpha: sg_blend_op = struct._7
      def op_alpha_=(value: sg_blend_op): Unit = !struct.at7 = value

  opaque type sg_buffer = CStruct1[uint32_t]
  object sg_buffer:
    given _tag: Tag[sg_buffer] = Tag.materializeCStruct1Tag[uint32_t]
    extension (struct: sg_buffer)
      def id: uint32_t = struct._1
      def id_=(value: uint32_t): Unit = !struct.at1 = value

  opaque type sg_buffer_desc = CStruct11[uint32_t, size_t, sg_buffer_type, sg_usage, sg_range, CString, CArray[uint32_t, Nat._2], CArray[Ptr[Byte], Nat._2], Ptr[Byte], Ptr[Byte], uint32_t]
  object sg_buffer_desc:
    given _tag: Tag[sg_buffer_desc] = Tag.materializeCStruct11Tag[uint32_t, size_t, sg_buffer_type, sg_usage, sg_range, CString, CArray[uint32_t, Nat._2], CArray[Ptr[Byte], Nat._2], Ptr[Byte], Ptr[Byte], uint32_t]
    extension (struct: sg_buffer_desc)
      def _start_canary: uint32_t = struct._1
      def _start_canary_=(value: uint32_t): Unit = !struct.at1 = value
      def size: size_t = struct._2
      def size_=(value: size_t): Unit = !struct.at2 = value
      def `type`: sg_buffer_type = struct._3
      def type_=(value: sg_buffer_type): Unit = !struct.at3 = value
      def usage: sg_usage = struct._4
      def usage_=(value: sg_usage): Unit = !struct.at4 = value
      def data: sg_range = struct._5
      def data_=(value: sg_range): Unit = !struct.at5 = value
      def label: CString = struct._6
      def label_=(value: CString): Unit = !struct.at6 = value
      def gl_buffers: CArray[uint32_t, Nat._2] = struct._7
      def gl_buffers_=(value: CArray[uint32_t, Nat._2]): Unit = !struct.at7 = value
      def mtl_buffers: CArray[Ptr[Byte], Nat._2] = struct._8
      def mtl_buffers_=(value: CArray[Ptr[Byte], Nat._2]): Unit = !struct.at8 = value
      def d3d11_buffer: Ptr[Byte] = struct._9
      def d3d11_buffer_=(value: Ptr[Byte]): Unit = !struct.at9 = value
      def wgpu_buffer: Ptr[Byte] = struct._10
      def wgpu_buffer_=(value: Ptr[Byte]): Unit = !struct.at10 = value
      def _end_canary: uint32_t = struct._11
      def _end_canary_=(value: uint32_t): Unit = !struct.at11 = value

  opaque type sg_buffer_info = CStruct7[sg_slot_info, uint32_t, uint32_t, CInt, CInt, CInt, CInt]
  object sg_buffer_info:
    given _tag: Tag[sg_buffer_info] = Tag.materializeCStruct7Tag[sg_slot_info, uint32_t, uint32_t, CInt, CInt, CInt, CInt]
    extension (struct: sg_buffer_info)
      def slot: sg_slot_info = struct._1
      def slot_=(value: sg_slot_info): Unit = !struct.at1 = value
      def update_frame_index: uint32_t = struct._2
      def update_frame_index_=(value: uint32_t): Unit = !struct.at2 = value
      def append_frame_index: uint32_t = struct._3
      def append_frame_index_=(value: uint32_t): Unit = !struct.at3 = value
      def append_pos: CInt = struct._4
      def append_pos_=(value: CInt): Unit = !struct.at4 = value
      def append_overflow: CInt = struct._5
      def append_overflow_=(value: CInt): Unit = !struct.at5 = value
      def num_slots: CInt = struct._6
      def num_slots_=(value: CInt): Unit = !struct.at6 = value
      def active_slot: CInt = struct._7
      def active_slot_=(value: CInt): Unit = !struct.at7 = value

  opaque type sg_buffer_layout_desc = CStruct3[CInt, sg_vertex_step, CInt]
  object sg_buffer_layout_desc:
    given _tag: Tag[sg_buffer_layout_desc] = Tag.materializeCStruct3Tag[CInt, sg_vertex_step, CInt]
    extension (struct: sg_buffer_layout_desc)
      def stride: CInt = struct._1
      def stride_=(value: CInt): Unit = !struct.at1 = value
      def step_func: sg_vertex_step = struct._2
      def step_func_=(value: sg_vertex_step): Unit = !struct.at2 = value
      def step_rate: CInt = struct._3
      def step_rate_=(value: CInt): Unit = !struct.at3 = value

  opaque type sg_color = CStruct4[Float, Float, Float, Float]
  object sg_color:
    given _tag: Tag[sg_color] = Tag.materializeCStruct4Tag[Float, Float, Float, Float]
    extension (struct: sg_color)
      def r: Float = struct._1
      def r_=(value: Float): Unit = !struct.at1 = value
      def g: Float = struct._2
      def g_=(value: Float): Unit = !struct.at2 = value
      def b: Float = struct._3
      def b_=(value: Float): Unit = !struct.at3 = value
      def a: Float = struct._4
      def a_=(value: Float): Unit = !struct.at4 = value

  opaque type sg_color_attachment_action = CStruct2[sg_action, sg_color]
  object sg_color_attachment_action:
    given _tag: Tag[sg_color_attachment_action] = Tag.materializeCStruct2Tag[sg_action, sg_color]
    extension (struct: sg_color_attachment_action)
      def action: sg_action = struct._1
      def action_=(value: sg_action): Unit = !struct.at1 = value
      def value: sg_color = struct._2
      def value_=(value: sg_color): Unit = !struct.at2 = value

  opaque type sg_color_state = CStruct3[sg_pixel_format, sg_color_mask, sg_blend_state]
  object sg_color_state:
    given _tag: Tag[sg_color_state] = Tag.materializeCStruct3Tag[sg_pixel_format, sg_color_mask, sg_blend_state]
    extension (struct: sg_color_state)
      def pixel_format: sg_pixel_format = struct._1
      def pixel_format_=(value: sg_pixel_format): Unit = !struct.at1 = value
      def write_mask: sg_color_mask = struct._2
      def write_mask_=(value: sg_color_mask): Unit = !struct.at2 = value
      def blend: sg_blend_state = struct._3
      def blend_=(value: sg_blend_state): Unit = !struct.at3 = value

  opaque type sg_context = CStruct1[uint32_t]
  object sg_context:
    given _tag: Tag[sg_context] = Tag.materializeCStruct1Tag[uint32_t]
    extension (struct: sg_context)
      def id: uint32_t = struct._1
      def id_=(value: uint32_t): Unit = !struct.at1 = value

  opaque type sg_context_desc = CStruct7[sg_pixel_format, sg_pixel_format, CInt, sg_gl_context_desc, sg_metal_context_desc, sg_d3d11_context_desc, sg_wgpu_context_desc]
  object sg_context_desc:
    given _tag: Tag[sg_context_desc] = Tag.materializeCStruct7Tag[sg_pixel_format, sg_pixel_format, CInt, sg_gl_context_desc, sg_metal_context_desc, sg_d3d11_context_desc, sg_wgpu_context_desc]
    extension (struct: sg_context_desc)
      def color_format: sg_pixel_format = struct._1
      def color_format_=(value: sg_pixel_format): Unit = !struct.at1 = value
      def depth_format: sg_pixel_format = struct._2
      def depth_format_=(value: sg_pixel_format): Unit = !struct.at2 = value
      def sample_count: CInt = struct._3
      def sample_count_=(value: CInt): Unit = !struct.at3 = value
      def gl: sg_gl_context_desc = struct._4
      def gl_=(value: sg_gl_context_desc): Unit = !struct.at4 = value
      def metal: sg_metal_context_desc = struct._5
      def metal_=(value: sg_metal_context_desc): Unit = !struct.at5 = value
      def d3d11: sg_d3d11_context_desc = struct._6
      def d3d11_=(value: sg_d3d11_context_desc): Unit = !struct.at6 = value
      def wgpu: sg_wgpu_context_desc = struct._7
      def wgpu_=(value: sg_wgpu_context_desc): Unit = !struct.at7 = value

  opaque type sg_d3d11_context_desc = CStruct7[Ptr[Byte], Ptr[Byte], Ptr[CFuncPtr0[Ptr[Byte]]], Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]], Ptr[CFuncPtr0[Ptr[Byte]]], Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]], Ptr[Byte]]
  object sg_d3d11_context_desc:
    given _tag: Tag[sg_d3d11_context_desc] = Tag.materializeCStruct7Tag[Ptr[Byte], Ptr[Byte], Ptr[CFuncPtr0[Ptr[Byte]]], Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]], Ptr[CFuncPtr0[Ptr[Byte]]], Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]], Ptr[Byte]]
    extension (struct: sg_d3d11_context_desc)
      def device: Ptr[Byte] = struct._1
      def device_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def device_context: Ptr[Byte] = struct._2
      def device_context_=(value: Ptr[Byte]): Unit = !struct.at2 = value
      def render_target_view_cb: Ptr[CFuncPtr0[Ptr[Byte]]] = struct._3
      def render_target_view_cb_=(value: Ptr[CFuncPtr0[Ptr[Byte]]]): Unit = !struct.at3 = value
      def render_target_view_userdata_cb: Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]] = struct._4
      def render_target_view_userdata_cb_=(value: Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]]): Unit = !struct.at4 = value
      def depth_stencil_view_cb: Ptr[CFuncPtr0[Ptr[Byte]]] = struct._5
      def depth_stencil_view_cb_=(value: Ptr[CFuncPtr0[Ptr[Byte]]]): Unit = !struct.at5 = value
      def depth_stencil_view_userdata_cb: Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]] = struct._6
      def depth_stencil_view_userdata_cb_=(value: Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]]): Unit = !struct.at6 = value
      def user_data: Ptr[Byte] = struct._7
      def user_data_=(value: Ptr[Byte]): Unit = !struct.at7 = value

  opaque type sg_depth_attachment_action = CStruct2[sg_action, Float]
  object sg_depth_attachment_action:
    given _tag: Tag[sg_depth_attachment_action] = Tag.materializeCStruct2Tag[sg_action, Float]
    extension (struct: sg_depth_attachment_action)
      def action: sg_action = struct._1
      def action_=(value: sg_action): Unit = !struct.at1 = value
      def value: Float = struct._2
      def value_=(value: Float): Unit = !struct.at2 = value

  opaque type sg_depth_state = CStruct6[sg_pixel_format, sg_compare_func, CInt, Float, Float, Float]
  object sg_depth_state:
    given _tag: Tag[sg_depth_state] = Tag.materializeCStruct6Tag[sg_pixel_format, sg_compare_func, CInt, Float, Float, Float]
    extension (struct: sg_depth_state)
      def pixel_format: sg_pixel_format = struct._1
      def pixel_format_=(value: sg_pixel_format): Unit = !struct.at1 = value
      def compare: sg_compare_func = struct._2
      def compare_=(value: sg_compare_func): Unit = !struct.at2 = value
      def write_enabled: CInt = struct._3
      def write_enabled_=(value: CInt): Unit = !struct.at3 = value
      def bias: Float = struct._4
      def bias_=(value: Float): Unit = !struct.at4 = value
      def bias_slope_scale: Float = struct._5
      def bias_slope_scale_=(value: Float): Unit = !struct.at5 = value
      def bias_clamp: Float = struct._6
      def bias_clamp_=(value: Float): Unit = !struct.at6 = value

  opaque type sg_desc = CStruct12[uint32_t, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, sg_context_desc, uint32_t]
  object sg_desc:
    given _tag: Tag[sg_desc] = Tag.materializeCStruct12Tag[uint32_t, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, sg_context_desc, uint32_t]
    extension (struct: sg_desc)
      def _start_canary: uint32_t = struct._1
      def _start_canary_=(value: uint32_t): Unit = !struct.at1 = value
      def buffer_pool_size: CInt = struct._2
      def buffer_pool_size_=(value: CInt): Unit = !struct.at2 = value
      def image_pool_size: CInt = struct._3
      def image_pool_size_=(value: CInt): Unit = !struct.at3 = value
      def shader_pool_size: CInt = struct._4
      def shader_pool_size_=(value: CInt): Unit = !struct.at4 = value
      def pipeline_pool_size: CInt = struct._5
      def pipeline_pool_size_=(value: CInt): Unit = !struct.at5 = value
      def pass_pool_size: CInt = struct._6
      def pass_pool_size_=(value: CInt): Unit = !struct.at6 = value
      def context_pool_size: CInt = struct._7
      def context_pool_size_=(value: CInt): Unit = !struct.at7 = value
      def uniform_buffer_size: CInt = struct._8
      def uniform_buffer_size_=(value: CInt): Unit = !struct.at8 = value
      def staging_buffer_size: CInt = struct._9
      def staging_buffer_size_=(value: CInt): Unit = !struct.at9 = value
      def sampler_cache_size: CInt = struct._10
      def sampler_cache_size_=(value: CInt): Unit = !struct.at10 = value
      def context: sg_context_desc = struct._11
      def context_=(value: sg_context_desc): Unit = !struct.at11 = value
      def _end_canary: uint32_t = struct._12
      def _end_canary_=(value: uint32_t): Unit = !struct.at12 = value

  opaque type sg_features = CStruct9[CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt]
  object sg_features:
    given _tag: Tag[sg_features] = Tag.materializeCStruct9Tag[CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt]
    extension (struct: sg_features)
      def instancing: CInt = struct._1
      def instancing_=(value: CInt): Unit = !struct.at1 = value
      def origin_top_left: CInt = struct._2
      def origin_top_left_=(value: CInt): Unit = !struct.at2 = value
      def multiple_render_targets: CInt = struct._3
      def multiple_render_targets_=(value: CInt): Unit = !struct.at3 = value
      def msaa_render_targets: CInt = struct._4
      def msaa_render_targets_=(value: CInt): Unit = !struct.at4 = value
      def imagetype_3d: CInt = struct._5
      def imagetype_3d_=(value: CInt): Unit = !struct.at5 = value
      def imagetype_array: CInt = struct._6
      def imagetype_array_=(value: CInt): Unit = !struct.at6 = value
      def image_clamp_to_border: CInt = struct._7
      def image_clamp_to_border_=(value: CInt): Unit = !struct.at7 = value
      def mrt_independent_blend_state: CInt = struct._8
      def mrt_independent_blend_state_=(value: CInt): Unit = !struct.at8 = value
      def mrt_independent_write_mask: CInt = struct._9
      def mrt_independent_write_mask_=(value: CInt): Unit = !struct.at9 = value

  opaque type sg_gl_context_desc = CStruct1[CInt]
  object sg_gl_context_desc:
    given _tag: Tag[sg_gl_context_desc] = Tag.materializeCStruct1Tag[CInt]
    extension (struct: sg_gl_context_desc)
      def force_gles2: CInt = struct._1
      def force_gles2_=(value: CInt): Unit = !struct.at1 = value

  opaque type sg_image = CStruct1[uint32_t]
  object sg_image:
    given _tag: Tag[sg_image] = Tag.materializeCStruct1Tag[uint32_t]
    extension (struct: sg_image)
      def id: uint32_t = struct._1
      def id_=(value: uint32_t): Unit = !struct.at1 = value

  opaque type sg_image_data = CStruct1[CArray[CArray[sg_range, Nat.Digit2[Nat._1, Nat._6]], Nat._6]]
  object sg_image_data:
    given _tag: Tag[sg_image_data] = Tag.materializeCStruct1Tag[CArray[CArray[sg_range, Nat.Digit2[Nat._1, Nat._6]], Nat._6]]
    extension (struct: sg_image_data)
      def subimage: CArray[CArray[sg_range, Nat.Digit2[Nat._1, Nat._6]], Nat._6] = struct._1
      def subimage_=(value: CArray[CArray[sg_range, Nat.Digit2[Nat._1, Nat._6]], Nat._6]): Unit = !struct.at1 = value

  opaque type sg_image_desc = CArray[Byte, Nat.Digit4[Nat._1, Nat._6, Nat._8, Nat._8]]
  object sg_image_desc:
    given _tag: Tag[sg_image_desc] = Tag.CArray[CChar, Nat.Digit4[Nat._1, Nat._6, Nat._8, Nat._8]](Tag.Byte, Tag.Digit4[Nat._1, Nat._6, Nat._8, Nat._8](Tag.Nat1, Tag.Nat6, Tag.Nat8, Tag.Nat8))
    extension (struct: sg_image_desc)
      def _start_canary: uint32_t = !struct.at(0).asInstanceOf[Ptr[uint32_t]]
      def _start_canary_=(value: uint32_t): Unit = !struct.at(0).asInstanceOf[Ptr[uint32_t]] = value
      def `type`: sg_image_type = !struct.at(4).asInstanceOf[Ptr[sg_image_type]]
      def type_=(value: sg_image_type): Unit = !struct.at(4).asInstanceOf[Ptr[sg_image_type]] = value
      def render_target: CInt = !struct.at(8).asInstanceOf[Ptr[CInt]]
      def render_target_=(value: CInt): Unit = !struct.at(8).asInstanceOf[Ptr[CInt]] = value
      def width: CInt = !struct.at(12).asInstanceOf[Ptr[CInt]]
      def width_=(value: CInt): Unit = !struct.at(12).asInstanceOf[Ptr[CInt]] = value
      def height: CInt = !struct.at(16).asInstanceOf[Ptr[CInt]]
      def height_=(value: CInt): Unit = !struct.at(16).asInstanceOf[Ptr[CInt]] = value
      def num_slices: CInt = !struct.at(20).asInstanceOf[Ptr[CInt]]
      def num_slices_=(value: CInt): Unit = !struct.at(20).asInstanceOf[Ptr[CInt]] = value
      def num_mipmaps: CInt = !struct.at(24).asInstanceOf[Ptr[CInt]]
      def num_mipmaps_=(value: CInt): Unit = !struct.at(24).asInstanceOf[Ptr[CInt]] = value
      def usage: sg_usage = !struct.at(28).asInstanceOf[Ptr[sg_usage]]
      def usage_=(value: sg_usage): Unit = !struct.at(28).asInstanceOf[Ptr[sg_usage]] = value
      def pixel_format: sg_pixel_format = !struct.at(32).asInstanceOf[Ptr[sg_pixel_format]]
      def pixel_format_=(value: sg_pixel_format): Unit = !struct.at(32).asInstanceOf[Ptr[sg_pixel_format]] = value
      def sample_count: CInt = !struct.at(36).asInstanceOf[Ptr[CInt]]
      def sample_count_=(value: CInt): Unit = !struct.at(36).asInstanceOf[Ptr[CInt]] = value
      def min_filter: sg_filter = !struct.at(40).asInstanceOf[Ptr[sg_filter]]
      def min_filter_=(value: sg_filter): Unit = !struct.at(40).asInstanceOf[Ptr[sg_filter]] = value
      def mag_filter: sg_filter = !struct.at(44).asInstanceOf[Ptr[sg_filter]]
      def mag_filter_=(value: sg_filter): Unit = !struct.at(44).asInstanceOf[Ptr[sg_filter]] = value
      def wrap_u: sg_wrap = !struct.at(48).asInstanceOf[Ptr[sg_wrap]]
      def wrap_u_=(value: sg_wrap): Unit = !struct.at(48).asInstanceOf[Ptr[sg_wrap]] = value
      def wrap_v: sg_wrap = !struct.at(52).asInstanceOf[Ptr[sg_wrap]]
      def wrap_v_=(value: sg_wrap): Unit = !struct.at(52).asInstanceOf[Ptr[sg_wrap]] = value
      def wrap_w: sg_wrap = !struct.at(56).asInstanceOf[Ptr[sg_wrap]]
      def wrap_w_=(value: sg_wrap): Unit = !struct.at(56).asInstanceOf[Ptr[sg_wrap]] = value
      def border_color: sg_border_color = !struct.at(60).asInstanceOf[Ptr[sg_border_color]]
      def border_color_=(value: sg_border_color): Unit = !struct.at(60).asInstanceOf[Ptr[sg_border_color]] = value
      def max_anisotropy: uint32_t = !struct.at(64).asInstanceOf[Ptr[uint32_t]]
      def max_anisotropy_=(value: uint32_t): Unit = !struct.at(64).asInstanceOf[Ptr[uint32_t]] = value
      def min_lod: Float = !struct.at(68).asInstanceOf[Ptr[Float]]
      def min_lod_=(value: Float): Unit = !struct.at(68).asInstanceOf[Ptr[Float]] = value
      def max_lod: Float = !struct.at(72).asInstanceOf[Ptr[Float]]
      def max_lod_=(value: Float): Unit = !struct.at(72).asInstanceOf[Ptr[Float]] = value
      def data: sg_image_data = !struct.at(80).asInstanceOf[Ptr[sg_image_data]]
      def data_=(value: sg_image_data): Unit = !struct.at(80).asInstanceOf[Ptr[sg_image_data]] = value
      def label: CString = !struct.at(1616).asInstanceOf[Ptr[CString]]
      def label_=(value: CString): Unit = !struct.at(1616).asInstanceOf[Ptr[CString]] = value
      def gl_textures: CArray[uint32_t, Nat._2] = !struct.at(1624).asInstanceOf[Ptr[CArray[uint32_t, Nat._2]]]
      def gl_textures_=(value: CArray[uint32_t, Nat._2]): Unit = !struct.at(1624).asInstanceOf[Ptr[CArray[uint32_t, Nat._2]]] = value
      def gl_texture_target: uint32_t = !struct.at(1632).asInstanceOf[Ptr[uint32_t]]
      def gl_texture_target_=(value: uint32_t): Unit = !struct.at(1632).asInstanceOf[Ptr[uint32_t]] = value
      def mtl_textures: CArray[Ptr[Byte], Nat._2] = !struct.at(1640).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._2]]]
      def mtl_textures_=(value: CArray[Ptr[Byte], Nat._2]): Unit = !struct.at(1640).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._2]]] = value
      def d3d11_texture: Ptr[Byte] = !struct.at(1656).asInstanceOf[Ptr[Ptr[Byte]]]
      def d3d11_texture_=(value: Ptr[Byte]): Unit = !struct.at(1656).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def d3d11_shader_resource_view: Ptr[Byte] = !struct.at(1664).asInstanceOf[Ptr[Ptr[Byte]]]
      def d3d11_shader_resource_view_=(value: Ptr[Byte]): Unit = !struct.at(1664).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def wgpu_texture: Ptr[Byte] = !struct.at(1672).asInstanceOf[Ptr[Ptr[Byte]]]
      def wgpu_texture_=(value: Ptr[Byte]): Unit = !struct.at(1672).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def _end_canary: uint32_t = !struct.at(1680).asInstanceOf[Ptr[uint32_t]]
      def _end_canary_=(value: uint32_t): Unit = !struct.at(1680).asInstanceOf[Ptr[uint32_t]] = value

  opaque type sg_image_info = CStruct6[sg_slot_info, uint32_t, CInt, CInt, CInt, CInt]
  object sg_image_info:
    given _tag: Tag[sg_image_info] = Tag.materializeCStruct6Tag[sg_slot_info, uint32_t, CInt, CInt, CInt, CInt]
    extension (struct: sg_image_info)
      def slot: sg_slot_info = struct._1
      def slot_=(value: sg_slot_info): Unit = !struct.at1 = value
      def upd_frame_index: uint32_t = struct._2
      def upd_frame_index_=(value: uint32_t): Unit = !struct.at2 = value
      def num_slots: CInt = struct._3
      def num_slots_=(value: CInt): Unit = !struct.at3 = value
      def active_slot: CInt = struct._4
      def active_slot_=(value: CInt): Unit = !struct.at4 = value
      def width: CInt = struct._5
      def width_=(value: CInt): Unit = !struct.at5 = value
      def height: CInt = struct._6
      def height_=(value: CInt): Unit = !struct.at6 = value

  opaque type sg_layout_desc = CStruct2[CArray[sg_buffer_layout_desc, Nat._8], CArray[sg_vertex_attr_desc, Nat.Digit2[Nat._1, Nat._6]]]
  object sg_layout_desc:
    given _tag: Tag[sg_layout_desc] = Tag.materializeCStruct2Tag[CArray[sg_buffer_layout_desc, Nat._8], CArray[sg_vertex_attr_desc, Nat.Digit2[Nat._1, Nat._6]]]
    extension (struct: sg_layout_desc)
      def buffers: CArray[sg_buffer_layout_desc, Nat._8] = struct._1
      def buffers_=(value: CArray[sg_buffer_layout_desc, Nat._8]): Unit = !struct.at1 = value
      def attrs: CArray[sg_vertex_attr_desc, Nat.Digit2[Nat._1, Nat._6]] = struct._2
      def attrs_=(value: CArray[sg_vertex_attr_desc, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at2 = value

  opaque type sg_limits = CStruct7[CInt, CInt, CInt, CInt, CInt, CInt, CInt]
  object sg_limits:
    given _tag: Tag[sg_limits] = Tag.materializeCStruct7Tag[CInt, CInt, CInt, CInt, CInt, CInt, CInt]
    extension (struct: sg_limits)
      def max_image_size_2d: CInt = struct._1
      def max_image_size_2d_=(value: CInt): Unit = !struct.at1 = value
      def max_image_size_cube: CInt = struct._2
      def max_image_size_cube_=(value: CInt): Unit = !struct.at2 = value
      def max_image_size_3d: CInt = struct._3
      def max_image_size_3d_=(value: CInt): Unit = !struct.at3 = value
      def max_image_size_array: CInt = struct._4
      def max_image_size_array_=(value: CInt): Unit = !struct.at4 = value
      def max_image_array_layers: CInt = struct._5
      def max_image_array_layers_=(value: CInt): Unit = !struct.at5 = value
      def max_vertex_attrs: CInt = struct._6
      def max_vertex_attrs_=(value: CInt): Unit = !struct.at6 = value
      def gl_max_vertex_uniform_vectors: CInt = struct._7
      def gl_max_vertex_uniform_vectors_=(value: CInt): Unit = !struct.at7 = value

  opaque type sg_metal_context_desc = CStruct6[Ptr[Byte], Ptr[CFuncPtr0[Ptr[Byte]]], Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]], Ptr[CFuncPtr0[Ptr[Byte]]], Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]], Ptr[Byte]]
  object sg_metal_context_desc:
    given _tag: Tag[sg_metal_context_desc] = Tag.materializeCStruct6Tag[Ptr[Byte], Ptr[CFuncPtr0[Ptr[Byte]]], Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]], Ptr[CFuncPtr0[Ptr[Byte]]], Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]], Ptr[Byte]]
    extension (struct: sg_metal_context_desc)
      def device: Ptr[Byte] = struct._1
      def device_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def renderpass_descriptor_cb: Ptr[CFuncPtr0[Ptr[Byte]]] = struct._2
      def renderpass_descriptor_cb_=(value: Ptr[CFuncPtr0[Ptr[Byte]]]): Unit = !struct.at2 = value
      def renderpass_descriptor_userdata_cb: Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]] = struct._3
      def renderpass_descriptor_userdata_cb_=(value: Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]]): Unit = !struct.at3 = value
      def drawable_cb: Ptr[CFuncPtr0[Ptr[Byte]]] = struct._4
      def drawable_cb_=(value: Ptr[CFuncPtr0[Ptr[Byte]]]): Unit = !struct.at4 = value
      def drawable_userdata_cb: Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]] = struct._5
      def drawable_userdata_cb_=(value: Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]]): Unit = !struct.at5 = value
      def user_data: Ptr[Byte] = struct._6
      def user_data_=(value: Ptr[Byte]): Unit = !struct.at6 = value

  opaque type sg_pass = CStruct1[uint32_t]
  object sg_pass:
    given _tag: Tag[sg_pass] = Tag.materializeCStruct1Tag[uint32_t]
    extension (struct: sg_pass)
      def id: uint32_t = struct._1
      def id_=(value: uint32_t): Unit = !struct.at1 = value

  opaque type sg_pass_action = CStruct5[uint32_t, CArray[sg_color_attachment_action, Nat._4], sg_depth_attachment_action, sg_stencil_attachment_action, uint32_t]
  object sg_pass_action:
    given _tag: Tag[sg_pass_action] = Tag.materializeCStruct5Tag[uint32_t, CArray[sg_color_attachment_action, Nat._4], sg_depth_attachment_action, sg_stencil_attachment_action, uint32_t]
    extension (struct: sg_pass_action)
      def _start_canary: uint32_t = struct._1
      def _start_canary_=(value: uint32_t): Unit = !struct.at1 = value
      def colors: CArray[sg_color_attachment_action, Nat._4] = struct._2
      def colors_=(value: CArray[sg_color_attachment_action, Nat._4]): Unit = !struct.at2 = value
      def depth: sg_depth_attachment_action = struct._3
      def depth_=(value: sg_depth_attachment_action): Unit = !struct.at3 = value
      def stencil: sg_stencil_attachment_action = struct._4
      def stencil_=(value: sg_stencil_attachment_action): Unit = !struct.at4 = value
      def _end_canary: uint32_t = struct._5
      def _end_canary_=(value: uint32_t): Unit = !struct.at5 = value

  opaque type sg_pass_attachment_desc = CStruct3[sg_image, CInt, CInt]
  object sg_pass_attachment_desc:
    given _tag: Tag[sg_pass_attachment_desc] = Tag.materializeCStruct3Tag[sg_image, CInt, CInt]
    extension (struct: sg_pass_attachment_desc)
      def image: sg_image = struct._1
      def image_=(value: sg_image): Unit = !struct.at1 = value
      def mip_level: CInt = struct._2
      def mip_level_=(value: CInt): Unit = !struct.at2 = value
      def slice: CInt = struct._3
      def slice_=(value: CInt): Unit = !struct.at3 = value

  opaque type sg_pass_desc = CStruct5[uint32_t, CArray[sg_pass_attachment_desc, Nat._4], sg_pass_attachment_desc, CString, uint32_t]
  object sg_pass_desc:
    given _tag: Tag[sg_pass_desc] = Tag.materializeCStruct5Tag[uint32_t, CArray[sg_pass_attachment_desc, Nat._4], sg_pass_attachment_desc, CString, uint32_t]
    extension (struct: sg_pass_desc)
      def _start_canary: uint32_t = struct._1
      def _start_canary_=(value: uint32_t): Unit = !struct.at1 = value
      def color_attachments: CArray[sg_pass_attachment_desc, Nat._4] = struct._2
      def color_attachments_=(value: CArray[sg_pass_attachment_desc, Nat._4]): Unit = !struct.at2 = value
      def depth_stencil_attachment: sg_pass_attachment_desc = struct._3
      def depth_stencil_attachment_=(value: sg_pass_attachment_desc): Unit = !struct.at3 = value
      def label: CString = struct._4
      def label_=(value: CString): Unit = !struct.at4 = value
      def _end_canary: uint32_t = struct._5
      def _end_canary_=(value: uint32_t): Unit = !struct.at5 = value

  opaque type sg_pass_info = CStruct1[sg_slot_info]
  object sg_pass_info:
    given _tag: Tag[sg_pass_info] = Tag.materializeCStruct1Tag[sg_slot_info]
    extension (struct: sg_pass_info)
      def slot: sg_slot_info = struct._1
      def slot_=(value: sg_slot_info): Unit = !struct.at1 = value

  opaque type sg_pipeline = CStruct1[uint32_t]
  object sg_pipeline:
    given _tag: Tag[sg_pipeline] = Tag.materializeCStruct1Tag[uint32_t]
    extension (struct: sg_pipeline)
      def id: uint32_t = struct._1
      def id_=(value: uint32_t): Unit = !struct.at1 = value

  opaque type sg_pipeline_desc = CStruct16[uint32_t, sg_shader, sg_layout_desc, sg_depth_state, sg_stencil_state, CInt, CArray[sg_color_state, Nat._4], sg_primitive_type, sg_index_type, sg_cull_mode, sg_face_winding, CInt, sg_color, CInt, CString, uint32_t]
  object sg_pipeline_desc:
    given _tag: Tag[sg_pipeline_desc] = Tag.materializeCStruct16Tag[uint32_t, sg_shader, sg_layout_desc, sg_depth_state, sg_stencil_state, CInt, CArray[sg_color_state, Nat._4], sg_primitive_type, sg_index_type, sg_cull_mode, sg_face_winding, CInt, sg_color, CInt, CString, uint32_t]
    extension (struct: sg_pipeline_desc)
      def _start_canary: uint32_t = struct._1
      def _start_canary_=(value: uint32_t): Unit = !struct.at1 = value
      def shader: sg_shader = struct._2
      def shader_=(value: sg_shader): Unit = !struct.at2 = value
      def layout: sg_layout_desc = struct._3
      def layout_=(value: sg_layout_desc): Unit = !struct.at3 = value
      def depth: sg_depth_state = struct._4
      def depth_=(value: sg_depth_state): Unit = !struct.at4 = value
      def stencil: sg_stencil_state = struct._5
      def stencil_=(value: sg_stencil_state): Unit = !struct.at5 = value
      def color_count: CInt = struct._6
      def color_count_=(value: CInt): Unit = !struct.at6 = value
      def colors: CArray[sg_color_state, Nat._4] = struct._7
      def colors_=(value: CArray[sg_color_state, Nat._4]): Unit = !struct.at7 = value
      def primitive_type: sg_primitive_type = struct._8
      def primitive_type_=(value: sg_primitive_type): Unit = !struct.at8 = value
      def index_type: sg_index_type = struct._9
      def index_type_=(value: sg_index_type): Unit = !struct.at9 = value
      def cull_mode: sg_cull_mode = struct._10
      def cull_mode_=(value: sg_cull_mode): Unit = !struct.at10 = value
      def face_winding: sg_face_winding = struct._11
      def face_winding_=(value: sg_face_winding): Unit = !struct.at11 = value
      def sample_count: CInt = struct._12
      def sample_count_=(value: CInt): Unit = !struct.at12 = value
      def blend_color: sg_color = struct._13
      def blend_color_=(value: sg_color): Unit = !struct.at13 = value
      def alpha_to_coverage_enabled: CInt = struct._14
      def alpha_to_coverage_enabled_=(value: CInt): Unit = !struct.at14 = value
      def label: CString = struct._15
      def label_=(value: CString): Unit = !struct.at15 = value
      def _end_canary: uint32_t = struct._16
      def _end_canary_=(value: uint32_t): Unit = !struct.at16 = value

  opaque type sg_pipeline_info = CStruct1[sg_slot_info]
  object sg_pipeline_info:
    given _tag: Tag[sg_pipeline_info] = Tag.materializeCStruct1Tag[sg_slot_info]
    extension (struct: sg_pipeline_info)
      def slot: sg_slot_info = struct._1
      def slot_=(value: sg_slot_info): Unit = !struct.at1 = value

  opaque type sg_pixelformat_info = CStruct6[CInt, CInt, CInt, CInt, CInt, CInt]
  object sg_pixelformat_info:
    given _tag: Tag[sg_pixelformat_info] = Tag.materializeCStruct6Tag[CInt, CInt, CInt, CInt, CInt, CInt]
    extension (struct: sg_pixelformat_info)
      def sample: CInt = struct._1
      def sample_=(value: CInt): Unit = !struct.at1 = value
      def filter: CInt = struct._2
      def filter_=(value: CInt): Unit = !struct.at2 = value
      def render: CInt = struct._3
      def render_=(value: CInt): Unit = !struct.at3 = value
      def blend: CInt = struct._4
      def blend_=(value: CInt): Unit = !struct.at4 = value
      def msaa: CInt = struct._5
      def msaa_=(value: CInt): Unit = !struct.at5 = value
      def depth: CInt = struct._6
      def depth_=(value: CInt): Unit = !struct.at6 = value

  opaque type sg_range = CStruct2[Ptr[Byte], size_t]
  object sg_range:
    given _tag: Tag[sg_range] = Tag.materializeCStruct2Tag[Ptr[Byte], size_t]
    extension (struct: sg_range)
      def ptr: Ptr[Byte] = struct._1
      def ptr_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def size: size_t = struct._2
      def size_=(value: size_t): Unit = !struct.at2 = value

  opaque type sg_shader = CStruct1[uint32_t]
  object sg_shader:
    given _tag: Tag[sg_shader] = Tag.materializeCStruct1Tag[uint32_t]
    extension (struct: sg_shader)
      def id: uint32_t = struct._1
      def id_=(value: uint32_t): Unit = !struct.at1 = value

  opaque type sg_shader_attr_desc = CStruct3[CString, CString, CInt]
  object sg_shader_attr_desc:
    given _tag: Tag[sg_shader_attr_desc] = Tag.materializeCStruct3Tag[CString, CString, CInt]
    extension (struct: sg_shader_attr_desc)
      def name: CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def sem_name: CString = struct._2
      def sem_name_=(value: CString): Unit = !struct.at2 = value
      def sem_index: CInt = struct._3
      def sem_index_=(value: CInt): Unit = !struct.at3 = value

  opaque type sg_shader_desc = CStruct6[uint32_t, CArray[sg_shader_attr_desc, Nat.Digit2[Nat._1, Nat._6]], sg_shader_stage_desc, sg_shader_stage_desc, CString, uint32_t]
  object sg_shader_desc:
    given _tag: Tag[sg_shader_desc] = Tag.materializeCStruct6Tag[uint32_t, CArray[sg_shader_attr_desc, Nat.Digit2[Nat._1, Nat._6]], sg_shader_stage_desc, sg_shader_stage_desc, CString, uint32_t]
    extension (struct: sg_shader_desc)
      def _start_canary: uint32_t = struct._1
      def _start_canary_=(value: uint32_t): Unit = !struct.at1 = value
      def attrs: CArray[sg_shader_attr_desc, Nat.Digit2[Nat._1, Nat._6]] = struct._2
      def attrs_=(value: CArray[sg_shader_attr_desc, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at2 = value
      def vs: sg_shader_stage_desc = struct._3
      def vs_=(value: sg_shader_stage_desc): Unit = !struct.at3 = value
      def fs: sg_shader_stage_desc = struct._4
      def fs_=(value: sg_shader_stage_desc): Unit = !struct.at4 = value
      def label: CString = struct._5
      def label_=(value: CString): Unit = !struct.at5 = value
      def _end_canary: uint32_t = struct._6
      def _end_canary_=(value: uint32_t): Unit = !struct.at6 = value

  opaque type sg_shader_image_desc = CStruct3[CString, sg_image_type, sg_sampler_type]
  object sg_shader_image_desc:
    given _tag: Tag[sg_shader_image_desc] = Tag.materializeCStruct3Tag[CString, sg_image_type, sg_sampler_type]
    extension (struct: sg_shader_image_desc)
      def name: CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def image_type: sg_image_type = struct._2
      def image_type_=(value: sg_image_type): Unit = !struct.at2 = value
      def sampler_type: sg_sampler_type = struct._3
      def sampler_type_=(value: sg_sampler_type): Unit = !struct.at3 = value

  opaque type sg_shader_info = CStruct1[sg_slot_info]
  object sg_shader_info:
    given _tag: Tag[sg_shader_info] = Tag.materializeCStruct1Tag[sg_slot_info]
    extension (struct: sg_shader_info)
      def slot: sg_slot_info = struct._1
      def slot_=(value: sg_slot_info): Unit = !struct.at1 = value

  opaque type sg_shader_stage_desc = CStruct6[CString, sg_range, CString, CString, CArray[sg_shader_uniform_block_desc, Nat._4], CArray[sg_shader_image_desc, Nat.Digit2[Nat._1, Nat._2]]]
  object sg_shader_stage_desc:
    given _tag: Tag[sg_shader_stage_desc] = Tag.materializeCStruct6Tag[CString, sg_range, CString, CString, CArray[sg_shader_uniform_block_desc, Nat._4], CArray[sg_shader_image_desc, Nat.Digit2[Nat._1, Nat._2]]]
    extension (struct: sg_shader_stage_desc)
      def source: CString = struct._1
      def source_=(value: CString): Unit = !struct.at1 = value
      def bytecode: sg_range = struct._2
      def bytecode_=(value: sg_range): Unit = !struct.at2 = value
      def entry: CString = struct._3
      def entry_=(value: CString): Unit = !struct.at3 = value
      def d3d11_target: CString = struct._4
      def d3d11_target_=(value: CString): Unit = !struct.at4 = value
      def uniform_blocks: CArray[sg_shader_uniform_block_desc, Nat._4] = struct._5
      def uniform_blocks_=(value: CArray[sg_shader_uniform_block_desc, Nat._4]): Unit = !struct.at5 = value
      def images: CArray[sg_shader_image_desc, Nat.Digit2[Nat._1, Nat._2]] = struct._6
      def images_=(value: CArray[sg_shader_image_desc, Nat.Digit2[Nat._1, Nat._2]]): Unit = !struct.at6 = value

  opaque type sg_shader_uniform_block_desc = CStruct2[size_t, CArray[sg_shader_uniform_desc, Nat.Digit2[Nat._1, Nat._6]]]
  object sg_shader_uniform_block_desc:
    given _tag: Tag[sg_shader_uniform_block_desc] = Tag.materializeCStruct2Tag[size_t, CArray[sg_shader_uniform_desc, Nat.Digit2[Nat._1, Nat._6]]]
    extension (struct: sg_shader_uniform_block_desc)
      def size: size_t = struct._1
      def size_=(value: size_t): Unit = !struct.at1 = value
      def uniforms: CArray[sg_shader_uniform_desc, Nat.Digit2[Nat._1, Nat._6]] = struct._2
      def uniforms_=(value: CArray[sg_shader_uniform_desc, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at2 = value

  opaque type sg_shader_uniform_desc = CStruct3[CString, sg_uniform_type, CInt]
  object sg_shader_uniform_desc:
    given _tag: Tag[sg_shader_uniform_desc] = Tag.materializeCStruct3Tag[CString, sg_uniform_type, CInt]
    extension (struct: sg_shader_uniform_desc)
      def name: CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def `type`: sg_uniform_type = struct._2
      def type_=(value: sg_uniform_type): Unit = !struct.at2 = value
      def array_count: CInt = struct._3
      def array_count_=(value: CInt): Unit = !struct.at3 = value

  opaque type sg_slot_info = CStruct3[sg_resource_state, uint32_t, uint32_t]
  object sg_slot_info:
    given _tag: Tag[sg_slot_info] = Tag.materializeCStruct3Tag[sg_resource_state, uint32_t, uint32_t]
    extension (struct: sg_slot_info)
      def state: sg_resource_state = struct._1
      def state_=(value: sg_resource_state): Unit = !struct.at1 = value
      def res_id: uint32_t = struct._2
      def res_id_=(value: uint32_t): Unit = !struct.at2 = value
      def ctx_id: uint32_t = struct._3
      def ctx_id_=(value: uint32_t): Unit = !struct.at3 = value

  opaque type sg_stencil_attachment_action = CStruct2[sg_action, uint8_t]
  object sg_stencil_attachment_action:
    given _tag: Tag[sg_stencil_attachment_action] = Tag.materializeCStruct2Tag[sg_action, uint8_t]
    extension (struct: sg_stencil_attachment_action)
      def action: sg_action = struct._1
      def action_=(value: sg_action): Unit = !struct.at1 = value
      def value: uint8_t = struct._2
      def value_=(value: uint8_t): Unit = !struct.at2 = value

  opaque type sg_stencil_face_state = CStruct4[sg_compare_func, sg_stencil_op, sg_stencil_op, sg_stencil_op]
  object sg_stencil_face_state:
    given _tag: Tag[sg_stencil_face_state] = Tag.materializeCStruct4Tag[sg_compare_func, sg_stencil_op, sg_stencil_op, sg_stencil_op]
    extension (struct: sg_stencil_face_state)
      def compare: sg_compare_func = struct._1
      def compare_=(value: sg_compare_func): Unit = !struct.at1 = value
      def fail_op: sg_stencil_op = struct._2
      def fail_op_=(value: sg_stencil_op): Unit = !struct.at2 = value
      def depth_fail_op: sg_stencil_op = struct._3
      def depth_fail_op_=(value: sg_stencil_op): Unit = !struct.at3 = value
      def pass_op: sg_stencil_op = struct._4
      def pass_op_=(value: sg_stencil_op): Unit = !struct.at4 = value

  opaque type sg_stencil_state = CStruct6[CInt, sg_stencil_face_state, sg_stencil_face_state, uint8_t, uint8_t, uint8_t]
  object sg_stencil_state:
    given _tag: Tag[sg_stencil_state] = Tag.materializeCStruct6Tag[CInt, sg_stencil_face_state, sg_stencil_face_state, uint8_t, uint8_t, uint8_t]
    extension (struct: sg_stencil_state)
      def enabled: CInt = struct._1
      def enabled_=(value: CInt): Unit = !struct.at1 = value
      def front: sg_stencil_face_state = struct._2
      def front_=(value: sg_stencil_face_state): Unit = !struct.at2 = value
      def back: sg_stencil_face_state = struct._3
      def back_=(value: sg_stencil_face_state): Unit = !struct.at3 = value
      def read_mask: uint8_t = struct._4
      def read_mask_=(value: uint8_t): Unit = !struct.at4 = value
      def write_mask: uint8_t = struct._5
      def write_mask_=(value: uint8_t): Unit = !struct.at5 = value
      def ref: uint8_t = struct._6
      def ref_=(value: uint8_t): Unit = !struct.at6 = value

  opaque type sg_trace_hooks = CArray[Byte, Nat.Digit3[Nat._4, Nat._8, Nat._8]]
  object sg_trace_hooks:
    given _tag: Tag[sg_trace_hooks] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._8, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._8, Nat._8](Tag.Nat4, Tag.Nat8, Tag.Nat8))
    extension (struct: sg_trace_hooks)
      def user_data: Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
      def user_data_=(value: Ptr[Byte]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def reset_state_cache: Ptr[CFuncPtr1[Ptr[Byte], Unit]] = !struct.at(8).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]]
      def reset_state_cache_=(value: Ptr[CFuncPtr1[Ptr[Byte], Unit]]): Unit = !struct.at(8).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]] = value
      def make_buffer: Ptr[CFuncPtr3[Ptr[sg_buffer_desc], sg_buffer, Ptr[Byte], Unit]] = !struct.at(16).asInstanceOf[Ptr[Ptr[CFuncPtr3[Ptr[sg_buffer_desc], sg_buffer, Ptr[Byte], Unit]]]]
      def make_buffer_=(value: Ptr[CFuncPtr3[Ptr[sg_buffer_desc], sg_buffer, Ptr[Byte], Unit]]): Unit = !struct.at(16).asInstanceOf[Ptr[Ptr[CFuncPtr3[Ptr[sg_buffer_desc], sg_buffer, Ptr[Byte], Unit]]]] = value
      def make_image: Ptr[CFuncPtr3[Ptr[sg_image_desc], sg_image, Ptr[Byte], Unit]] = !struct.at(24).asInstanceOf[Ptr[Ptr[CFuncPtr3[Ptr[sg_image_desc], sg_image, Ptr[Byte], Unit]]]]
      def make_image_=(value: Ptr[CFuncPtr3[Ptr[sg_image_desc], sg_image, Ptr[Byte], Unit]]): Unit = !struct.at(24).asInstanceOf[Ptr[Ptr[CFuncPtr3[Ptr[sg_image_desc], sg_image, Ptr[Byte], Unit]]]] = value
      def make_shader: Ptr[CFuncPtr3[Ptr[sg_shader_desc], sg_shader, Ptr[Byte], Unit]] = !struct.at(32).asInstanceOf[Ptr[Ptr[CFuncPtr3[Ptr[sg_shader_desc], sg_shader, Ptr[Byte], Unit]]]]
      def make_shader_=(value: Ptr[CFuncPtr3[Ptr[sg_shader_desc], sg_shader, Ptr[Byte], Unit]]): Unit = !struct.at(32).asInstanceOf[Ptr[Ptr[CFuncPtr3[Ptr[sg_shader_desc], sg_shader, Ptr[Byte], Unit]]]] = value
      def make_pipeline: Ptr[CFuncPtr3[Ptr[sg_pipeline_desc], sg_pipeline, Ptr[Byte], Unit]] = !struct.at(40).asInstanceOf[Ptr[Ptr[CFuncPtr3[Ptr[sg_pipeline_desc], sg_pipeline, Ptr[Byte], Unit]]]]
      def make_pipeline_=(value: Ptr[CFuncPtr3[Ptr[sg_pipeline_desc], sg_pipeline, Ptr[Byte], Unit]]): Unit = !struct.at(40).asInstanceOf[Ptr[Ptr[CFuncPtr3[Ptr[sg_pipeline_desc], sg_pipeline, Ptr[Byte], Unit]]]] = value
      def make_pass: Ptr[CFuncPtr3[Ptr[sg_pass_desc], sg_pass, Ptr[Byte], Unit]] = !struct.at(48).asInstanceOf[Ptr[Ptr[CFuncPtr3[Ptr[sg_pass_desc], sg_pass, Ptr[Byte], Unit]]]]
      def make_pass_=(value: Ptr[CFuncPtr3[Ptr[sg_pass_desc], sg_pass, Ptr[Byte], Unit]]): Unit = !struct.at(48).asInstanceOf[Ptr[Ptr[CFuncPtr3[Ptr[sg_pass_desc], sg_pass, Ptr[Byte], Unit]]]] = value
      def destroy_buffer: Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]] = !struct.at(56).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]]]]
      def destroy_buffer_=(value: Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]]): Unit = !struct.at(56).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]]]] = value
      def destroy_image: Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]] = !struct.at(64).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]]]]
      def destroy_image_=(value: Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]]): Unit = !struct.at(64).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]]]] = value
      def destroy_shader: Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]] = !struct.at(72).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]]]]
      def destroy_shader_=(value: Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]]): Unit = !struct.at(72).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]]]] = value
      def destroy_pipeline: Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]] = !struct.at(80).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]]]]
      def destroy_pipeline_=(value: Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]]): Unit = !struct.at(80).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]]]] = value
      def destroy_pass: Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]] = !struct.at(88).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]]]]
      def destroy_pass_=(value: Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]]): Unit = !struct.at(88).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]]]] = value
      def update_buffer: Ptr[CFuncPtr3[sg_buffer, Ptr[sg_range], Ptr[Byte], Unit]] = !struct.at(96).asInstanceOf[Ptr[Ptr[CFuncPtr3[sg_buffer, Ptr[sg_range], Ptr[Byte], Unit]]]]
      def update_buffer_=(value: Ptr[CFuncPtr3[sg_buffer, Ptr[sg_range], Ptr[Byte], Unit]]): Unit = !struct.at(96).asInstanceOf[Ptr[Ptr[CFuncPtr3[sg_buffer, Ptr[sg_range], Ptr[Byte], Unit]]]] = value
      def update_image: Ptr[CFuncPtr3[sg_image, Ptr[sg_image_data], Ptr[Byte], Unit]] = !struct.at(104).asInstanceOf[Ptr[Ptr[CFuncPtr3[sg_image, Ptr[sg_image_data], Ptr[Byte], Unit]]]]
      def update_image_=(value: Ptr[CFuncPtr3[sg_image, Ptr[sg_image_data], Ptr[Byte], Unit]]): Unit = !struct.at(104).asInstanceOf[Ptr[Ptr[CFuncPtr3[sg_image, Ptr[sg_image_data], Ptr[Byte], Unit]]]] = value
      def append_buffer: Ptr[CFuncPtr4[sg_buffer, Ptr[sg_range], CInt, Ptr[Byte], Unit]] = !struct.at(112).asInstanceOf[Ptr[Ptr[CFuncPtr4[sg_buffer, Ptr[sg_range], CInt, Ptr[Byte], Unit]]]]
      def append_buffer_=(value: Ptr[CFuncPtr4[sg_buffer, Ptr[sg_range], CInt, Ptr[Byte], Unit]]): Unit = !struct.at(112).asInstanceOf[Ptr[Ptr[CFuncPtr4[sg_buffer, Ptr[sg_range], CInt, Ptr[Byte], Unit]]]] = value
      def begin_default_pass: Ptr[CFuncPtr4[Ptr[sg_pass_action], CInt, CInt, Ptr[Byte], Unit]] = !struct.at(120).asInstanceOf[Ptr[Ptr[CFuncPtr4[Ptr[sg_pass_action], CInt, CInt, Ptr[Byte], Unit]]]]
      def begin_default_pass_=(value: Ptr[CFuncPtr4[Ptr[sg_pass_action], CInt, CInt, Ptr[Byte], Unit]]): Unit = !struct.at(120).asInstanceOf[Ptr[Ptr[CFuncPtr4[Ptr[sg_pass_action], CInt, CInt, Ptr[Byte], Unit]]]] = value
      def begin_pass: Ptr[CFuncPtr3[sg_pass, Ptr[sg_pass_action], Ptr[Byte], Unit]] = !struct.at(128).asInstanceOf[Ptr[Ptr[CFuncPtr3[sg_pass, Ptr[sg_pass_action], Ptr[Byte], Unit]]]]
      def begin_pass_=(value: Ptr[CFuncPtr3[sg_pass, Ptr[sg_pass_action], Ptr[Byte], Unit]]): Unit = !struct.at(128).asInstanceOf[Ptr[Ptr[CFuncPtr3[sg_pass, Ptr[sg_pass_action], Ptr[Byte], Unit]]]] = value
      def apply_viewport: Ptr[CFuncPtr6[CInt, CInt, CInt, CInt, CInt, Ptr[Byte], Unit]] = !struct.at(136).asInstanceOf[Ptr[Ptr[CFuncPtr6[CInt, CInt, CInt, CInt, CInt, Ptr[Byte], Unit]]]]
      def apply_viewport_=(value: Ptr[CFuncPtr6[CInt, CInt, CInt, CInt, CInt, Ptr[Byte], Unit]]): Unit = !struct.at(136).asInstanceOf[Ptr[Ptr[CFuncPtr6[CInt, CInt, CInt, CInt, CInt, Ptr[Byte], Unit]]]] = value
      def apply_scissor_rect: Ptr[CFuncPtr6[CInt, CInt, CInt, CInt, CInt, Ptr[Byte], Unit]] = !struct.at(144).asInstanceOf[Ptr[Ptr[CFuncPtr6[CInt, CInt, CInt, CInt, CInt, Ptr[Byte], Unit]]]]
      def apply_scissor_rect_=(value: Ptr[CFuncPtr6[CInt, CInt, CInt, CInt, CInt, Ptr[Byte], Unit]]): Unit = !struct.at(144).asInstanceOf[Ptr[Ptr[CFuncPtr6[CInt, CInt, CInt, CInt, CInt, Ptr[Byte], Unit]]]] = value
      def apply_pipeline: Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]] = !struct.at(152).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]]]]
      def apply_pipeline_=(value: Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]]): Unit = !struct.at(152).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]]]] = value
      def apply_bindings: Ptr[CFuncPtr2[Ptr[sg_bindings], Ptr[Byte], Unit]] = !struct.at(160).asInstanceOf[Ptr[Ptr[CFuncPtr2[Ptr[sg_bindings], Ptr[Byte], Unit]]]]
      def apply_bindings_=(value: Ptr[CFuncPtr2[Ptr[sg_bindings], Ptr[Byte], Unit]]): Unit = !struct.at(160).asInstanceOf[Ptr[Ptr[CFuncPtr2[Ptr[sg_bindings], Ptr[Byte], Unit]]]] = value
      def apply_uniforms: Ptr[CFuncPtr4[sg_shader_stage, CInt, Ptr[sg_range], Ptr[Byte], Unit]] = !struct.at(168).asInstanceOf[Ptr[Ptr[CFuncPtr4[sg_shader_stage, CInt, Ptr[sg_range], Ptr[Byte], Unit]]]]
      def apply_uniforms_=(value: Ptr[CFuncPtr4[sg_shader_stage, CInt, Ptr[sg_range], Ptr[Byte], Unit]]): Unit = !struct.at(168).asInstanceOf[Ptr[Ptr[CFuncPtr4[sg_shader_stage, CInt, Ptr[sg_range], Ptr[Byte], Unit]]]] = value
      def draw: Ptr[CFuncPtr4[CInt, CInt, CInt, Ptr[Byte], Unit]] = !struct.at(176).asInstanceOf[Ptr[Ptr[CFuncPtr4[CInt, CInt, CInt, Ptr[Byte], Unit]]]]
      def draw_=(value: Ptr[CFuncPtr4[CInt, CInt, CInt, Ptr[Byte], Unit]]): Unit = !struct.at(176).asInstanceOf[Ptr[Ptr[CFuncPtr4[CInt, CInt, CInt, Ptr[Byte], Unit]]]] = value
      def end_pass: Ptr[CFuncPtr1[Ptr[Byte], Unit]] = !struct.at(184).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]]
      def end_pass_=(value: Ptr[CFuncPtr1[Ptr[Byte], Unit]]): Unit = !struct.at(184).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]] = value
      def commit: Ptr[CFuncPtr1[Ptr[Byte], Unit]] = !struct.at(192).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]]
      def commit_=(value: Ptr[CFuncPtr1[Ptr[Byte], Unit]]): Unit = !struct.at(192).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]] = value
      def alloc_buffer: Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]] = !struct.at(200).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]]]]
      def alloc_buffer_=(value: Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]]): Unit = !struct.at(200).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]]]] = value
      def alloc_image: Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]] = !struct.at(208).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]]]]
      def alloc_image_=(value: Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]]): Unit = !struct.at(208).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]]]] = value
      def alloc_shader: Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]] = !struct.at(216).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]]]]
      def alloc_shader_=(value: Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]]): Unit = !struct.at(216).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]]]] = value
      def alloc_pipeline: Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]] = !struct.at(224).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]]]]
      def alloc_pipeline_=(value: Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]]): Unit = !struct.at(224).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]]]] = value
      def alloc_pass: Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]] = !struct.at(232).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]]]]
      def alloc_pass_=(value: Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]]): Unit = !struct.at(232).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]]]] = value
      def dealloc_buffer: Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]] = !struct.at(240).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]]]]
      def dealloc_buffer_=(value: Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]]): Unit = !struct.at(240).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]]]] = value
      def dealloc_image: Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]] = !struct.at(248).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]]]]
      def dealloc_image_=(value: Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]]): Unit = !struct.at(248).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]]]] = value
      def dealloc_shader: Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]] = !struct.at(256).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]]]]
      def dealloc_shader_=(value: Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]]): Unit = !struct.at(256).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]]]] = value
      def dealloc_pipeline: Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]] = !struct.at(264).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]]]]
      def dealloc_pipeline_=(value: Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]]): Unit = !struct.at(264).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]]]] = value
      def dealloc_pass: Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]] = !struct.at(272).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]]]]
      def dealloc_pass_=(value: Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]]): Unit = !struct.at(272).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]]]] = value
      def init_buffer: Ptr[CFuncPtr3[sg_buffer, Ptr[sg_buffer_desc], Ptr[Byte], Unit]] = !struct.at(280).asInstanceOf[Ptr[Ptr[CFuncPtr3[sg_buffer, Ptr[sg_buffer_desc], Ptr[Byte], Unit]]]]
      def init_buffer_=(value: Ptr[CFuncPtr3[sg_buffer, Ptr[sg_buffer_desc], Ptr[Byte], Unit]]): Unit = !struct.at(280).asInstanceOf[Ptr[Ptr[CFuncPtr3[sg_buffer, Ptr[sg_buffer_desc], Ptr[Byte], Unit]]]] = value
      def init_image: Ptr[CFuncPtr3[sg_image, Ptr[sg_image_desc], Ptr[Byte], Unit]] = !struct.at(288).asInstanceOf[Ptr[Ptr[CFuncPtr3[sg_image, Ptr[sg_image_desc], Ptr[Byte], Unit]]]]
      def init_image_=(value: Ptr[CFuncPtr3[sg_image, Ptr[sg_image_desc], Ptr[Byte], Unit]]): Unit = !struct.at(288).asInstanceOf[Ptr[Ptr[CFuncPtr3[sg_image, Ptr[sg_image_desc], Ptr[Byte], Unit]]]] = value
      def init_shader: Ptr[CFuncPtr3[sg_shader, Ptr[sg_shader_desc], Ptr[Byte], Unit]] = !struct.at(296).asInstanceOf[Ptr[Ptr[CFuncPtr3[sg_shader, Ptr[sg_shader_desc], Ptr[Byte], Unit]]]]
      def init_shader_=(value: Ptr[CFuncPtr3[sg_shader, Ptr[sg_shader_desc], Ptr[Byte], Unit]]): Unit = !struct.at(296).asInstanceOf[Ptr[Ptr[CFuncPtr3[sg_shader, Ptr[sg_shader_desc], Ptr[Byte], Unit]]]] = value
      def init_pipeline: Ptr[CFuncPtr3[sg_pipeline, Ptr[sg_pipeline_desc], Ptr[Byte], Unit]] = !struct.at(304).asInstanceOf[Ptr[Ptr[CFuncPtr3[sg_pipeline, Ptr[sg_pipeline_desc], Ptr[Byte], Unit]]]]
      def init_pipeline_=(value: Ptr[CFuncPtr3[sg_pipeline, Ptr[sg_pipeline_desc], Ptr[Byte], Unit]]): Unit = !struct.at(304).asInstanceOf[Ptr[Ptr[CFuncPtr3[sg_pipeline, Ptr[sg_pipeline_desc], Ptr[Byte], Unit]]]] = value
      def init_pass: Ptr[CFuncPtr3[sg_pass, Ptr[sg_pass_desc], Ptr[Byte], Unit]] = !struct.at(312).asInstanceOf[Ptr[Ptr[CFuncPtr3[sg_pass, Ptr[sg_pass_desc], Ptr[Byte], Unit]]]]
      def init_pass_=(value: Ptr[CFuncPtr3[sg_pass, Ptr[sg_pass_desc], Ptr[Byte], Unit]]): Unit = !struct.at(312).asInstanceOf[Ptr[Ptr[CFuncPtr3[sg_pass, Ptr[sg_pass_desc], Ptr[Byte], Unit]]]] = value
      def uninit_buffer: Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]] = !struct.at(320).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]]]]
      def uninit_buffer_=(value: Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]]): Unit = !struct.at(320).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]]]] = value
      def uninit_image: Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]] = !struct.at(328).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]]]]
      def uninit_image_=(value: Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]]): Unit = !struct.at(328).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]]]] = value
      def uninit_shader: Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]] = !struct.at(336).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]]]]
      def uninit_shader_=(value: Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]]): Unit = !struct.at(336).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]]]] = value
      def uninit_pipeline: Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]] = !struct.at(344).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]]]]
      def uninit_pipeline_=(value: Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]]): Unit = !struct.at(344).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]]]] = value
      def uninit_pass: Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]] = !struct.at(352).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]]]]
      def uninit_pass_=(value: Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]]): Unit = !struct.at(352).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]]]] = value
      def fail_buffer: Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]] = !struct.at(360).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]]]]
      def fail_buffer_=(value: Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]]): Unit = !struct.at(360).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_buffer, Ptr[Byte], Unit]]]] = value
      def fail_image: Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]] = !struct.at(368).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]]]]
      def fail_image_=(value: Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]]): Unit = !struct.at(368).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_image, Ptr[Byte], Unit]]]] = value
      def fail_shader: Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]] = !struct.at(376).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]]]]
      def fail_shader_=(value: Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]]): Unit = !struct.at(376).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_shader, Ptr[Byte], Unit]]]] = value
      def fail_pipeline: Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]] = !struct.at(384).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]]]]
      def fail_pipeline_=(value: Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]]): Unit = !struct.at(384).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pipeline, Ptr[Byte], Unit]]]] = value
      def fail_pass: Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]] = !struct.at(392).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]]]]
      def fail_pass_=(value: Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]]): Unit = !struct.at(392).asInstanceOf[Ptr[Ptr[CFuncPtr2[sg_pass, Ptr[Byte], Unit]]]] = value
      def push_debug_group: Ptr[CFuncPtr2[CString, Ptr[Byte], Unit]] = !struct.at(400).asInstanceOf[Ptr[Ptr[CFuncPtr2[CString, Ptr[Byte], Unit]]]]
      def push_debug_group_=(value: Ptr[CFuncPtr2[CString, Ptr[Byte], Unit]]): Unit = !struct.at(400).asInstanceOf[Ptr[Ptr[CFuncPtr2[CString, Ptr[Byte], Unit]]]] = value
      def pop_debug_group: Ptr[CFuncPtr1[Ptr[Byte], Unit]] = !struct.at(408).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]]
      def pop_debug_group_=(value: Ptr[CFuncPtr1[Ptr[Byte], Unit]]): Unit = !struct.at(408).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]] = value
      def err_buffer_pool_exhausted: Ptr[CFuncPtr1[Ptr[Byte], Unit]] = !struct.at(416).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]]
      def err_buffer_pool_exhausted_=(value: Ptr[CFuncPtr1[Ptr[Byte], Unit]]): Unit = !struct.at(416).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]] = value
      def err_image_pool_exhausted: Ptr[CFuncPtr1[Ptr[Byte], Unit]] = !struct.at(424).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]]
      def err_image_pool_exhausted_=(value: Ptr[CFuncPtr1[Ptr[Byte], Unit]]): Unit = !struct.at(424).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]] = value
      def err_shader_pool_exhausted: Ptr[CFuncPtr1[Ptr[Byte], Unit]] = !struct.at(432).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]]
      def err_shader_pool_exhausted_=(value: Ptr[CFuncPtr1[Ptr[Byte], Unit]]): Unit = !struct.at(432).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]] = value
      def err_pipeline_pool_exhausted: Ptr[CFuncPtr1[Ptr[Byte], Unit]] = !struct.at(440).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]]
      def err_pipeline_pool_exhausted_=(value: Ptr[CFuncPtr1[Ptr[Byte], Unit]]): Unit = !struct.at(440).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]] = value
      def err_pass_pool_exhausted: Ptr[CFuncPtr1[Ptr[Byte], Unit]] = !struct.at(448).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]]
      def err_pass_pool_exhausted_=(value: Ptr[CFuncPtr1[Ptr[Byte], Unit]]): Unit = !struct.at(448).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]] = value
      def err_context_mismatch: Ptr[CFuncPtr1[Ptr[Byte], Unit]] = !struct.at(456).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]]
      def err_context_mismatch_=(value: Ptr[CFuncPtr1[Ptr[Byte], Unit]]): Unit = !struct.at(456).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]] = value
      def err_pass_invalid: Ptr[CFuncPtr1[Ptr[Byte], Unit]] = !struct.at(464).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]]
      def err_pass_invalid_=(value: Ptr[CFuncPtr1[Ptr[Byte], Unit]]): Unit = !struct.at(464).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]] = value
      def err_draw_invalid: Ptr[CFuncPtr1[Ptr[Byte], Unit]] = !struct.at(472).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]]
      def err_draw_invalid_=(value: Ptr[CFuncPtr1[Ptr[Byte], Unit]]): Unit = !struct.at(472).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]] = value
      def err_bindings_invalid: Ptr[CFuncPtr1[Ptr[Byte], Unit]] = !struct.at(480).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]]
      def err_bindings_invalid_=(value: Ptr[CFuncPtr1[Ptr[Byte], Unit]]): Unit = !struct.at(480).asInstanceOf[Ptr[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]] = value

  opaque type sg_vertex_attr_desc = CStruct3[CInt, CInt, sg_vertex_format]
  object sg_vertex_attr_desc:
    given _tag: Tag[sg_vertex_attr_desc] = Tag.materializeCStruct3Tag[CInt, CInt, sg_vertex_format]
    extension (struct: sg_vertex_attr_desc)
      def buffer_index: CInt = struct._1
      def buffer_index_=(value: CInt): Unit = !struct.at1 = value
      def offset: CInt = struct._2
      def offset_=(value: CInt): Unit = !struct.at2 = value
      def format: sg_vertex_format = struct._3
      def format_=(value: sg_vertex_format): Unit = !struct.at3 = value

  opaque type sg_wgpu_context_desc = CStruct8[Ptr[Byte], Ptr[CFuncPtr0[Ptr[Byte]]], Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]], Ptr[CFuncPtr0[Ptr[Byte]]], Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]], Ptr[CFuncPtr0[Ptr[Byte]]], Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]], Ptr[Byte]]
  object sg_wgpu_context_desc:
    given _tag: Tag[sg_wgpu_context_desc] = Tag.materializeCStruct8Tag[Ptr[Byte], Ptr[CFuncPtr0[Ptr[Byte]]], Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]], Ptr[CFuncPtr0[Ptr[Byte]]], Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]], Ptr[CFuncPtr0[Ptr[Byte]]], Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]], Ptr[Byte]]
    extension (struct: sg_wgpu_context_desc)
      def device: Ptr[Byte] = struct._1
      def device_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def render_view_cb: Ptr[CFuncPtr0[Ptr[Byte]]] = struct._2
      def render_view_cb_=(value: Ptr[CFuncPtr0[Ptr[Byte]]]): Unit = !struct.at2 = value
      def render_view_userdata_cb: Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]] = struct._3
      def render_view_userdata_cb_=(value: Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]]): Unit = !struct.at3 = value
      def resolve_view_cb: Ptr[CFuncPtr0[Ptr[Byte]]] = struct._4
      def resolve_view_cb_=(value: Ptr[CFuncPtr0[Ptr[Byte]]]): Unit = !struct.at4 = value
      def resolve_view_userdata_cb: Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]] = struct._5
      def resolve_view_userdata_cb_=(value: Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]]): Unit = !struct.at5 = value
      def depth_stencil_view_cb: Ptr[CFuncPtr0[Ptr[Byte]]] = struct._6
      def depth_stencil_view_cb_=(value: Ptr[CFuncPtr0[Ptr[Byte]]]): Unit = !struct.at6 = value
      def depth_stencil_view_userdata_cb: Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]] = struct._7
      def depth_stencil_view_userdata_cb_=(value: Ptr[CFuncPtr1[Ptr[Byte], Ptr[Byte]]]): Unit = !struct.at7 = value
      def user_data: Ptr[Byte] = struct._8
      def user_data_=(value: Ptr[Byte]): Unit = !struct.at8 = value
  opaque type __mbstate_t = CArray[Byte, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
  object __mbstate_t:
    given _tag: Tag[__mbstate_t] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]](Tag.Byte, Tag.Digit3[Nat._1, Nat._2, Nat._8](Tag.Nat1, Tag.Nat2, Tag.Nat8))
    extension (struct: __mbstate_t)
      def __mbstate8: CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]] = !struct.at(0).asInstanceOf[Ptr[CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]]]]
      def _mbstateL: CLongLong = !struct.at(0).asInstanceOf[Ptr[CLongLong]]
@link("sokol")
@extern
private[libsokol] object extern_functions: 
  import types.*

  @name("__sn_wrap_sg_append_buffer")
  private[libsokol] def __sn_wrap_sg_append_buffer(buf: Ptr[sg_buffer], data: Ptr[sg_range]): CInt = extern

  @name("__sn_wrap_sg_update_image")
  private[libsokol] def __sn_wrap_sg_update_image(img: Ptr[sg_image], data: Ptr[sg_image_data]): Unit = extern

  @name("__sn_wrap_sg_activate_context")
  private[libsokol] def __sn_wrap_sg_activate_context(ctx_id: Ptr[sg_context]): Unit = extern

  @name("__sn_wrap_sg_query_pass_info")
  private[libsokol] def __sn_wrap_sg_query_pass_info(pass: Ptr[sg_pass], __return: Ptr[sg_pass_info]): Unit = extern

  @name("__sn_wrap_sg_fail_shader")
  private[libsokol] def __sn_wrap_sg_fail_shader(shd_id: Ptr[sg_shader]): Unit = extern

  @name("__sn_wrap_sg_query_pass_defaults")
  private[libsokol] def __sn_wrap_sg_query_pass_defaults(desc: Ptr[sg_pass_desc], __return: Ptr[sg_pass_desc]): Unit = extern

  @name("__sn_wrap_sg_dealloc_pipeline")
  private[libsokol] def __sn_wrap_sg_dealloc_pipeline(pip_id: Ptr[sg_pipeline]): Unit = extern

  @name("__sn_wrap_sg_query_desc")
  private[libsokol] def __sn_wrap_sg_query_desc(__return: Ptr[sg_desc]): Unit = extern

  @name("__sn_wrap_sg_fail_image")
  private[libsokol] def __sn_wrap_sg_fail_image(img_id: Ptr[sg_image]): Unit = extern

  @name("__sn_wrap_sg_query_image_info")
  private[libsokol] def __sn_wrap_sg_query_image_info(img: Ptr[sg_image], __return: Ptr[sg_image_info]): Unit = extern

  @name("__sn_wrap_sg_query_pass_state")
  private[libsokol] def __sn_wrap_sg_query_pass_state(pass: Ptr[sg_pass]): sg_resource_state = extern

  @name("__sn_wrap_sg_destroy_pass")
  private[libsokol] def __sn_wrap_sg_destroy_pass(pass: Ptr[sg_pass]): Unit = extern

  @name("__sn_wrap_sg_dealloc_shader")
  private[libsokol] def __sn_wrap_sg_dealloc_shader(shd_id: Ptr[sg_shader]): Unit = extern

  @name("__sn_wrap_sg_query_pipeline_defaults")
  private[libsokol] def __sn_wrap_sg_query_pipeline_defaults(desc: Ptr[sg_pipeline_desc], __return: Ptr[sg_pipeline_desc]): Unit = extern

  @name("__sn_wrap_sg_init_image")
  private[libsokol] def __sn_wrap_sg_init_image(img_id: Ptr[sg_image], desc: Ptr[sg_image_desc]): Unit = extern

  @name("__sn_wrap_sg_update_buffer")
  private[libsokol] def __sn_wrap_sg_update_buffer(buf: Ptr[sg_buffer], data: Ptr[sg_range]): Unit = extern

  @name("__sn_wrap_sg_fail_pipeline")
  private[libsokol] def __sn_wrap_sg_fail_pipeline(pip_id: Ptr[sg_pipeline]): Unit = extern

  @name("__sn_wrap_sg_query_pixelformat")
  private[libsokol] def __sn_wrap_sg_query_pixelformat(fmt: sg_pixel_format, __return: Ptr[sg_pixelformat_info]): Unit = extern

  @name("__sn_wrap_sg_query_pipeline_state")
  private[libsokol] def __sn_wrap_sg_query_pipeline_state(pip: Ptr[sg_pipeline]): sg_resource_state = extern

  @name("__sn_wrap_sg_fail_buffer")
  private[libsokol] def __sn_wrap_sg_fail_buffer(buf_id: Ptr[sg_buffer]): Unit = extern

  @name("__sn_wrap_sg_setup_context")
  private[libsokol] def __sn_wrap_sg_setup_context(__return: Ptr[sg_context]): Unit = extern

  @name("__sn_wrap_sg_dealloc_buffer")
  private[libsokol] def __sn_wrap_sg_dealloc_buffer(buf_id: Ptr[sg_buffer]): Unit = extern

  @name("__sn_wrap_sg_make_image")
  private[libsokol] def __sn_wrap_sg_make_image(desc: Ptr[sg_image_desc], __return: Ptr[sg_image]): Unit = extern

  @name("__sn_wrap_sg_destroy_image")
  private[libsokol] def __sn_wrap_sg_destroy_image(img: Ptr[sg_image]): Unit = extern

  @name("__sn_wrap_sg_alloc_pipeline")
  private[libsokol] def __sn_wrap_sg_alloc_pipeline(__return: Ptr[sg_pipeline]): Unit = extern

  @name("__sn_wrap_sg_query_image_state")
  private[libsokol] def __sn_wrap_sg_query_image_state(img: Ptr[sg_image]): sg_resource_state = extern

  @name("__sn_wrap_sg_destroy_pipeline")
  private[libsokol] def __sn_wrap_sg_destroy_pipeline(pip: Ptr[sg_pipeline]): Unit = extern

  @name("__sn_wrap_sg_make_pipeline")
  private[libsokol] def __sn_wrap_sg_make_pipeline(desc: Ptr[sg_pipeline_desc], __return: Ptr[sg_pipeline]): Unit = extern

  @name("__sn_wrap_sg_fail_pass")
  private[libsokol] def __sn_wrap_sg_fail_pass(pass_id: Ptr[sg_pass]): Unit = extern

  @name("__sn_wrap_sg_init_pipeline")
  private[libsokol] def __sn_wrap_sg_init_pipeline(pip_id: Ptr[sg_pipeline], desc: Ptr[sg_pipeline_desc]): Unit = extern

  @name("__sn_wrap_sg_init_buffer")
  private[libsokol] def __sn_wrap_sg_init_buffer(buf_id: Ptr[sg_buffer], desc: Ptr[sg_buffer_desc]): Unit = extern

  @name("__sn_wrap_sg_query_pipeline_info")
  private[libsokol] def __sn_wrap_sg_query_pipeline_info(pip: Ptr[sg_pipeline], __return: Ptr[sg_pipeline_info]): Unit = extern

  @name("__sn_wrap_sg_query_buffer_defaults")
  private[libsokol] def __sn_wrap_sg_query_buffer_defaults(desc: Ptr[sg_buffer_desc], __return: Ptr[sg_buffer_desc]): Unit = extern

  @name("__sn_wrap_sg_make_buffer")
  private[libsokol] def __sn_wrap_sg_make_buffer(desc: Ptr[sg_buffer_desc], __return: Ptr[sg_buffer]): Unit = extern

  @name("__sn_wrap_sg_alloc_shader")
  private[libsokol] def __sn_wrap_sg_alloc_shader(__return: Ptr[sg_shader]): Unit = extern

  @name("__sn_wrap_sg_alloc_buffer")
  private[libsokol] def __sn_wrap_sg_alloc_buffer(__return: Ptr[sg_buffer]): Unit = extern

  @name("__sn_wrap_sg_query_limits")
  private[libsokol] def __sn_wrap_sg_query_limits(__return: Ptr[sg_limits]): Unit = extern

  @name("__sn_wrap_sg_discard_context")
  private[libsokol] def __sn_wrap_sg_discard_context(ctx_id: Ptr[sg_context]): Unit = extern

  @name("__sn_wrap_sg_install_trace_hooks")
  private[libsokol] def __sn_wrap_sg_install_trace_hooks(trace_hooks: Ptr[sg_trace_hooks], __return: Ptr[sg_trace_hooks]): Unit = extern

  @name("__sn_wrap_sg_alloc_image")
  private[libsokol] def __sn_wrap_sg_alloc_image(__return: Ptr[sg_image]): Unit = extern

  @name("__sn_wrap_sg_init_shader")
  private[libsokol] def __sn_wrap_sg_init_shader(shd_id: Ptr[sg_shader], desc: Ptr[sg_shader_desc]): Unit = extern

  @name("__sn_wrap_sg_destroy_buffer")
  private[libsokol] def __sn_wrap_sg_destroy_buffer(buf: Ptr[sg_buffer]): Unit = extern

  @name("__sn_wrap_sg_query_shader_info")
  private[libsokol] def __sn_wrap_sg_query_shader_info(shd: Ptr[sg_shader], __return: Ptr[sg_shader_info]): Unit = extern

  @name("__sn_wrap_sg_init_pass")
  private[libsokol] def __sn_wrap_sg_init_pass(pass_id: Ptr[sg_pass], desc: Ptr[sg_pass_desc]): Unit = extern

  @name("__sn_wrap_sg_query_image_defaults")
  private[libsokol] def __sn_wrap_sg_query_image_defaults(desc: Ptr[sg_image_desc], __return: Ptr[sg_image_desc]): Unit = extern

  @name("__sn_wrap_sg_query_buffer_state")
  private[libsokol] def __sn_wrap_sg_query_buffer_state(buf: Ptr[sg_buffer]): sg_resource_state = extern

  @name("__sn_wrap_sg_query_shader_state")
  private[libsokol] def __sn_wrap_sg_query_shader_state(shd: Ptr[sg_shader]): sg_resource_state = extern

  @name("__sn_wrap_sg_query_buffer_info")
  private[libsokol] def __sn_wrap_sg_query_buffer_info(buf: Ptr[sg_buffer], __return: Ptr[sg_buffer_info]): Unit = extern

  @name("__sn_wrap_sg_destroy_shader")
  private[libsokol] def __sn_wrap_sg_destroy_shader(shd: Ptr[sg_shader]): Unit = extern

  @name("__sn_wrap_sg_make_shader")
  private[libsokol] def __sn_wrap_sg_make_shader(desc: Ptr[sg_shader_desc], __return: Ptr[sg_shader]): Unit = extern

  @name("__sn_wrap_sg_alloc_pass")
  private[libsokol] def __sn_wrap_sg_alloc_pass(__return: Ptr[sg_pass]): Unit = extern

  @name("__sn_wrap_sg_dealloc_pass")
  private[libsokol] def __sn_wrap_sg_dealloc_pass(pass_id: Ptr[sg_pass]): Unit = extern

  @name("__sn_wrap_sg_apply_pipeline")
  private[libsokol] def __sn_wrap_sg_apply_pipeline(pip: Ptr[sg_pipeline]): Unit = extern

  @name("__sn_wrap_sg_begin_pass")
  private[libsokol] def __sn_wrap_sg_begin_pass(pass: Ptr[sg_pass], pass_action: Ptr[sg_pass_action]): Unit = extern

  @name("__sn_wrap_sg_query_features")
  private[libsokol] def __sn_wrap_sg_query_features(__return: Ptr[sg_features]): Unit = extern

  @name("__sn_wrap_sg_make_pass")
  private[libsokol] def __sn_wrap_sg_make_pass(desc: Ptr[sg_pass_desc], __return: Ptr[sg_pass]): Unit = extern

  @name("__sn_wrap_sg_dealloc_image")
  private[libsokol] def __sn_wrap_sg_dealloc_image(img_id: Ptr[sg_image]): Unit = extern

  @name("__sn_wrap_sg_query_shader_defaults")
  private[libsokol] def __sn_wrap_sg_query_shader_defaults(desc: Ptr[sg_shader_desc], __return: Ptr[sg_shader_desc]): Unit = extern

  def sg_apply_bindings(bindings: Ptr[sg_bindings]): Unit = extern

  def sg_apply_scissor_rect(x: CInt, y: CInt, width: CInt, height: CInt, origin_top_left: CInt): Unit = extern

  def sg_apply_scissor_rectf(x: Float, y: Float, width: Float, height: Float, origin_top_left: CInt): Unit = extern

  def sg_apply_uniforms(stage: sg_shader_stage, ub_index: CInt, data: Ptr[sg_range]): Unit = extern

  def sg_apply_viewport(x: CInt, y: CInt, width: CInt, height: CInt, origin_top_left: CInt): Unit = extern

  def sg_apply_viewportf(x: Float, y: Float, width: Float, height: Float, origin_top_left: CInt): Unit = extern

  def sg_begin_default_pass(pass_action: Ptr[sg_pass_action], width: CInt, height: CInt): Unit = extern

  def sg_begin_default_passf(pass_action: Ptr[sg_pass_action], width: Float, height: Float): Unit = extern

  def sg_commit(): Unit = extern

  def sg_d3d11_device(): Ptr[Byte] = extern

  def sg_draw(base_element: CInt, num_elements: CInt, num_instances: CInt): Unit = extern

  def sg_end_pass(): Unit = extern

  def sg_isvalid(): CInt = extern

  def sg_mtl_device(): Ptr[Byte] = extern

  def sg_mtl_render_command_encoder(): Ptr[Byte] = extern

  def sg_pop_debug_group(): Unit = extern

  def sg_push_debug_group(name: CString): Unit = extern

  def sg_query_backend(): sg_backend = extern

  def sg_query_buffer_overflow(): CInt = extern

  def sg_reset_state_cache(): Unit = extern

  def sg_setup(desc: Ptr[sg_desc]): Unit = extern

  def sg_shutdown(): Unit = extern

  def sg_uninit_buffer(): CInt = extern

  def sg_uninit_image(): CInt = extern

  def sg_uninit_pass(): CInt = extern

  def sg_uninit_pipeline(): CInt = extern

  def sg_uninit_shader(): CInt = extern

object functions: 
  import types.*, extern_functions.*

  export extern_functions.*

  def sg_activate_context(ctx_id: sg_context)(using Zone): Unit = 
    val _ptr_0 = alloc[sg_context](1)
    __sn_wrap_sg_activate_context(_ptr_0)

  def sg_alloc_buffer()(using Zone): sg_buffer = 
    val _ptr_return = alloc[sg_buffer](1)
    __sn_wrap_sg_alloc_buffer(_ptr_return)
    !_ptr_return

  def sg_alloc_image()(using Zone): sg_image = 
    val _ptr_return = alloc[sg_image](1)
    __sn_wrap_sg_alloc_image(_ptr_return)
    !_ptr_return

  def sg_alloc_pass()(using Zone): sg_pass = 
    val _ptr_return = alloc[sg_pass](1)
    __sn_wrap_sg_alloc_pass(_ptr_return)
    !_ptr_return

  def sg_alloc_pipeline()(using Zone): sg_pipeline = 
    val _ptr_return = alloc[sg_pipeline](1)
    __sn_wrap_sg_alloc_pipeline(_ptr_return)
    !_ptr_return

  def sg_alloc_shader()(using Zone): sg_shader = 
    val _ptr_return = alloc[sg_shader](1)
    __sn_wrap_sg_alloc_shader(_ptr_return)
    !_ptr_return

  def sg_append_buffer(buf: sg_buffer, data: Ptr[sg_range])(using Zone): CInt = 
    val _ptr_0 = alloc[sg_buffer](1)
    __sn_wrap_sg_append_buffer(_ptr_0, data)

  def sg_apply_pipeline(pip: sg_pipeline)(using Zone): Unit = 
    val _ptr_0 = alloc[sg_pipeline](1)
    __sn_wrap_sg_apply_pipeline(_ptr_0)

  def sg_begin_pass(pass: sg_pass, pass_action: Ptr[sg_pass_action])(using Zone): Unit = 
    val _ptr_0 = alloc[sg_pass](1)
    __sn_wrap_sg_begin_pass(_ptr_0, pass_action)

  def sg_dealloc_buffer(buf_id: sg_buffer)(using Zone): Unit = 
    val _ptr_0 = alloc[sg_buffer](1)
    __sn_wrap_sg_dealloc_buffer(_ptr_0)

  def sg_dealloc_image(img_id: sg_image)(using Zone): Unit = 
    val _ptr_0 = alloc[sg_image](1)
    __sn_wrap_sg_dealloc_image(_ptr_0)

  def sg_dealloc_pass(pass_id: sg_pass)(using Zone): Unit = 
    val _ptr_0 = alloc[sg_pass](1)
    __sn_wrap_sg_dealloc_pass(_ptr_0)

  def sg_dealloc_pipeline(pip_id: sg_pipeline)(using Zone): Unit = 
    val _ptr_0 = alloc[sg_pipeline](1)
    __sn_wrap_sg_dealloc_pipeline(_ptr_0)

  def sg_dealloc_shader(shd_id: sg_shader)(using Zone): Unit = 
    val _ptr_0 = alloc[sg_shader](1)
    __sn_wrap_sg_dealloc_shader(_ptr_0)

  def sg_destroy_buffer(buf: sg_buffer)(using Zone): Unit = 
    val _ptr_0 = alloc[sg_buffer](1)
    __sn_wrap_sg_destroy_buffer(_ptr_0)

  def sg_destroy_image(img: sg_image)(using Zone): Unit = 
    val _ptr_0 = alloc[sg_image](1)
    __sn_wrap_sg_destroy_image(_ptr_0)

  def sg_destroy_pass(pass: sg_pass)(using Zone): Unit = 
    val _ptr_0 = alloc[sg_pass](1)
    __sn_wrap_sg_destroy_pass(_ptr_0)

  def sg_destroy_pipeline(pip: sg_pipeline)(using Zone): Unit = 
    val _ptr_0 = alloc[sg_pipeline](1)
    __sn_wrap_sg_destroy_pipeline(_ptr_0)

  def sg_destroy_shader(shd: sg_shader)(using Zone): Unit = 
    val _ptr_0 = alloc[sg_shader](1)
    __sn_wrap_sg_destroy_shader(_ptr_0)

  def sg_discard_context(ctx_id: sg_context)(using Zone): Unit = 
    val _ptr_0 = alloc[sg_context](1)
    __sn_wrap_sg_discard_context(_ptr_0)

  def sg_fail_buffer(buf_id: sg_buffer)(using Zone): Unit = 
    val _ptr_0 = alloc[sg_buffer](1)
    __sn_wrap_sg_fail_buffer(_ptr_0)

  def sg_fail_image(img_id: sg_image)(using Zone): Unit = 
    val _ptr_0 = alloc[sg_image](1)
    __sn_wrap_sg_fail_image(_ptr_0)

  def sg_fail_pass(pass_id: sg_pass)(using Zone): Unit = 
    val _ptr_0 = alloc[sg_pass](1)
    __sn_wrap_sg_fail_pass(_ptr_0)

  def sg_fail_pipeline(pip_id: sg_pipeline)(using Zone): Unit = 
    val _ptr_0 = alloc[sg_pipeline](1)
    __sn_wrap_sg_fail_pipeline(_ptr_0)

  def sg_fail_shader(shd_id: sg_shader)(using Zone): Unit = 
    val _ptr_0 = alloc[sg_shader](1)
    __sn_wrap_sg_fail_shader(_ptr_0)

  def sg_init_buffer(buf_id: sg_buffer, desc: Ptr[sg_buffer_desc])(using Zone): Unit = 
    val _ptr_0 = alloc[sg_buffer](1)
    __sn_wrap_sg_init_buffer(_ptr_0, desc)

  def sg_init_image(img_id: sg_image, desc: Ptr[sg_image_desc])(using Zone): Unit = 
    val _ptr_0 = alloc[sg_image](1)
    __sn_wrap_sg_init_image(_ptr_0, desc)

  def sg_init_pass(pass_id: sg_pass, desc: Ptr[sg_pass_desc])(using Zone): Unit = 
    val _ptr_0 = alloc[sg_pass](1)
    __sn_wrap_sg_init_pass(_ptr_0, desc)

  def sg_init_pipeline(pip_id: sg_pipeline, desc: Ptr[sg_pipeline_desc])(using Zone): Unit = 
    val _ptr_0 = alloc[sg_pipeline](1)
    __sn_wrap_sg_init_pipeline(_ptr_0, desc)

  def sg_init_shader(shd_id: sg_shader, desc: Ptr[sg_shader_desc])(using Zone): Unit = 
    val _ptr_0 = alloc[sg_shader](1)
    __sn_wrap_sg_init_shader(_ptr_0, desc)

  def sg_install_trace_hooks(trace_hooks: Ptr[sg_trace_hooks])(using Zone): sg_trace_hooks = 
    val _ptr_return = alloc[sg_trace_hooks](1)
    __sn_wrap_sg_install_trace_hooks(trace_hooks, _ptr_return)
    !_ptr_return

  def sg_make_buffer(desc: Ptr[sg_buffer_desc])(using Zone): sg_buffer = 
    val _ptr_return = alloc[sg_buffer](1)
    __sn_wrap_sg_make_buffer(desc, _ptr_return)
    !_ptr_return

  def sg_make_image(desc: Ptr[sg_image_desc])(using Zone): sg_image = 
    val _ptr_return = alloc[sg_image](1)
    __sn_wrap_sg_make_image(desc, _ptr_return)
    !_ptr_return

  def sg_make_pass(desc: Ptr[sg_pass_desc])(using Zone): sg_pass = 
    val _ptr_return = alloc[sg_pass](1)
    __sn_wrap_sg_make_pass(desc, _ptr_return)
    !_ptr_return

  def sg_make_pipeline(desc: Ptr[sg_pipeline_desc])(using Zone): sg_pipeline = 
    val _ptr_return = alloc[sg_pipeline](1)
    __sn_wrap_sg_make_pipeline(desc, _ptr_return)
    !_ptr_return

  def sg_make_shader(desc: Ptr[sg_shader_desc])(using Zone): sg_shader = 
    val _ptr_return = alloc[sg_shader](1)
    __sn_wrap_sg_make_shader(desc, _ptr_return)
    !_ptr_return

  def sg_query_buffer_defaults(desc: Ptr[sg_buffer_desc])(using Zone): sg_buffer_desc = 
    val _ptr_return = alloc[sg_buffer_desc](1)
    __sn_wrap_sg_query_buffer_defaults(desc, _ptr_return)
    !_ptr_return

  def sg_query_buffer_info(buf: sg_buffer)(using Zone): sg_buffer_info = 
    val _ptr_0 = alloc[sg_buffer](1)
    val _ptr_return = alloc[sg_buffer_info](1)
    __sn_wrap_sg_query_buffer_info(_ptr_0, _ptr_return)
    !_ptr_return

  def sg_query_buffer_state(buf: sg_buffer)(using Zone): sg_resource_state = 
    val _ptr_0 = alloc[sg_buffer](1)
    __sn_wrap_sg_query_buffer_state(_ptr_0)

  def sg_query_desc()(using Zone): sg_desc = 
    val _ptr_return = alloc[sg_desc](1)
    __sn_wrap_sg_query_desc(_ptr_return)
    !_ptr_return

  def sg_query_features()(using Zone): sg_features = 
    val _ptr_return = alloc[sg_features](1)
    __sn_wrap_sg_query_features(_ptr_return)
    !_ptr_return

  def sg_query_image_defaults(desc: Ptr[sg_image_desc])(using Zone): sg_image_desc = 
    val _ptr_return = alloc[sg_image_desc](1)
    __sn_wrap_sg_query_image_defaults(desc, _ptr_return)
    !_ptr_return

  def sg_query_image_info(img: sg_image)(using Zone): sg_image_info = 
    val _ptr_0 = alloc[sg_image](1)
    val _ptr_return = alloc[sg_image_info](1)
    __sn_wrap_sg_query_image_info(_ptr_0, _ptr_return)
    !_ptr_return

  def sg_query_image_state(img: sg_image)(using Zone): sg_resource_state = 
    val _ptr_0 = alloc[sg_image](1)
    __sn_wrap_sg_query_image_state(_ptr_0)

  def sg_query_limits()(using Zone): sg_limits = 
    val _ptr_return = alloc[sg_limits](1)
    __sn_wrap_sg_query_limits(_ptr_return)
    !_ptr_return

  def sg_query_pass_defaults(desc: Ptr[sg_pass_desc])(using Zone): sg_pass_desc = 
    val _ptr_return = alloc[sg_pass_desc](1)
    __sn_wrap_sg_query_pass_defaults(desc, _ptr_return)
    !_ptr_return

  def sg_query_pass_info(pass: sg_pass)(using Zone): sg_pass_info = 
    val _ptr_0 = alloc[sg_pass](1)
    val _ptr_return = alloc[sg_pass_info](1)
    __sn_wrap_sg_query_pass_info(_ptr_0, _ptr_return)
    !_ptr_return

  def sg_query_pass_state(pass: sg_pass)(using Zone): sg_resource_state = 
    val _ptr_0 = alloc[sg_pass](1)
    __sn_wrap_sg_query_pass_state(_ptr_0)

  def sg_query_pipeline_defaults(desc: Ptr[sg_pipeline_desc])(using Zone): sg_pipeline_desc = 
    val _ptr_return = alloc[sg_pipeline_desc](1)
    __sn_wrap_sg_query_pipeline_defaults(desc, _ptr_return)
    !_ptr_return

  def sg_query_pipeline_info(pip: sg_pipeline)(using Zone): sg_pipeline_info = 
    val _ptr_0 = alloc[sg_pipeline](1)
    val _ptr_return = alloc[sg_pipeline_info](1)
    __sn_wrap_sg_query_pipeline_info(_ptr_0, _ptr_return)
    !_ptr_return

  def sg_query_pipeline_state(pip: sg_pipeline)(using Zone): sg_resource_state = 
    val _ptr_0 = alloc[sg_pipeline](1)
    __sn_wrap_sg_query_pipeline_state(_ptr_0)

  def sg_query_pixelformat(fmt: sg_pixel_format)(using Zone): sg_pixelformat_info = 
    val _ptr_return = alloc[sg_pixelformat_info](1)
    __sn_wrap_sg_query_pixelformat(fmt, _ptr_return)
    !_ptr_return

  def sg_query_shader_defaults(desc: Ptr[sg_shader_desc])(using Zone): sg_shader_desc = 
    val _ptr_return = alloc[sg_shader_desc](1)
    __sn_wrap_sg_query_shader_defaults(desc, _ptr_return)
    !_ptr_return

  def sg_query_shader_info(shd: sg_shader)(using Zone): sg_shader_info = 
    val _ptr_0 = alloc[sg_shader](1)
    val _ptr_return = alloc[sg_shader_info](1)
    __sn_wrap_sg_query_shader_info(_ptr_0, _ptr_return)
    !_ptr_return

  def sg_query_shader_state(shd: sg_shader)(using Zone): sg_resource_state = 
    val _ptr_0 = alloc[sg_shader](1)
    __sn_wrap_sg_query_shader_state(_ptr_0)

  def sg_setup_context()(using Zone): sg_context = 
    val _ptr_return = alloc[sg_context](1)
    __sn_wrap_sg_setup_context(_ptr_return)
    !_ptr_return

  def sg_update_buffer(buf: sg_buffer, data: Ptr[sg_range])(using Zone): Unit = 
    val _ptr_0 = alloc[sg_buffer](1)
    __sn_wrap_sg_update_buffer(_ptr_0, data)

  def sg_update_image(img: sg_image, data: Ptr[sg_image_data])(using Zone): Unit = 
    val _ptr_0 = alloc[sg_image](1)
    __sn_wrap_sg_update_image(_ptr_0, data)


